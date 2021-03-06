/*
 * Copyright 2010 Pablo Arrighi, Alex Concha, Miguel Lezama for version 1.
 * Copyright 2013 Pablo Arrighi, Miguel Lezama, Kevin Mazet for version 2.    
 *
 * This file is part of GOOL.
 *
 * GOOL is free software: you can redistribute it and/or modify it under the terms of the GNU
 * General Public License as published by the Free Software Foundation, version 3.
 *
 * GOOL is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License version 3 for more details.
 *
 * You should have received a copy of the GNU General Public License along with GOOL,
 * in the file COPYING.txt.  If not, see <http://www.gnu.org/licenses/>.
 */

package gool.generator.common;

import gool.ast.core.ClassDef;
import gool.ast.core.Dependency;
import gool.ast.core.Node;
import gool.ast.type.IType;
import gool.generator.GeneratorHelper;
import gool.generator.GoolGeneratorController;
import gool.generator.common.exception.VelocityException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import logger.Log;

import org.apache.commons.lang.StringUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.exception.ParseErrorException;
import org.apache.velocity.exception.ResourceNotFoundException;

/**
 * Provides the basic functionality to generate code from a list of GOOL
 * classes. This class is used to parse the velocity templates depending of the
 * target language.
 * 
 * Note: Only one {@link CodeGenerator} at a time is supported.
 */
public abstract class CodePrinter {
	/**
	 * The directory where the generated code will be written. Usually, this is
	 * that specified in gool.properties For a given target language But
	 * ultimately this is specified by Platform objects
	 */
	private File outputDir;

	/**
	 * This list is just to remember which abstract GOOL classes were printed
	 * already.
	 */
	protected Set<ClassDef> printedClasses = new HashSet<ClassDef>();

	/**
	 * the Velocity template engine.
	 */
	private VelocityEngine engine;

	/**
	 * The selected code generator.
	 */
	private CodeGenerator generator;

	private Collection<File> myFileToCopy;

	/**
	 * Creates a new {@link CodePrinter} with a specific {@link CodeGenerator}.
	 * 
	 * @param generator
	 *            the {@link CodeGenerator} used to produce the code.
	 * @param outputDir
	 * @throws Exception
	 * @throws Exception
	 *             when the velocity engine can not be properly initialized.
	 */
	public CodePrinter(CodeGenerator generator, File outputDir,
			Collection<File> myFile) {
		this.generator = generator;
		this.engine = new VelocityEngine();
		this.outputDir = outputDir;
		this.myFileToCopy = myFile;

		for (File fi : myFileToCopy) {
			File fd;

			String path = "";
			try {
				int i = fi.getCanonicalPath().lastIndexOf("src") + 4;
				path = fi.getCanonicalPath().toString().substring(i);
			} catch (IOException e) {
				Log.e(e.toString());
			}
			if (path.length() != fi.getName().length()) {
				int nbF = (path.length() - fi.getName().length() - 1);
				String a = path.substring(0, nbF);
				new File(outputDir + File.separator + a).mkdirs();

			}
			fd = new File(outputDir + File.separator + path);
			try {
				CopierFichier(fi, fd);
			} catch (FileNotFoundException e1) {
				System.out.println(e1.toString());
			}

		}

		GoolGeneratorController.setCodeGenerator(generator);
		try {
			Properties p = new Properties();
			p.setProperty("resource.loader", "class");
			p.setProperty("class.resource.loader.class",
					"org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
			engine.init(p);
		} catch (Exception e) {
			throw new VelocityException(
					"The velocity engine can not be properly initialized.", e);
		}

	}

	public CodePrinter(CodeGenerator generator, File outputDir) {
		this.generator = generator;
		this.engine = new VelocityEngine();
		this.outputDir = outputDir;

		GoolGeneratorController.setCodeGenerator(generator);
		try {
			Properties p = new Properties();
			p.setProperty("resource.loader", "class");
			p.setProperty("class.resource.loader.class",
					"org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader");
			engine.init(p);
		} catch (Exception e) {
			throw new VelocityException(
					"The velocity engine can not be properly initialized.", e);
		}

	}

	/**
	 * Cleans the output directory.
	 */
	public void clean() {
		File[] files = outputDir.listFiles();
		if (files != null) {
			for (File file : files) {
				if (!file.isFile()) {
					file.delete();
				}
			}
		}
	}

	/**
	 * Gets the {@link CodeGenerator} associated to this printer.
	 * 
	 * @return the {@link CodeGenerator} associated to this printer.
	 */
	public CodeGenerator getCodeGenerator() {
		return generator;
	}

	/**
	 * Parses a Velocity template with its required parameters. Except for the
	 * top ClassDef.getCode() call triggered by the print(ClassDef) below all of
	 * the other getCode() calls will be triggered from here by velocity itself.
	 * 
	 * @param template
	 *            the relative path to a velocity template.
	 * @param classDef
	 *            the abstract GOOL that will fill in the template.
	 * @return the code generated for the selected template.
	 * @throws Exception
	 * @throws ParseErrorException
	 * @throws ResourceNotFoundException
	 * @throws Exception
	 *             when Velocity is unable to parse the template.
	 */
	public String processTemplate(String templateFilename, Node classDef) {

		try {
			// Load the template into velocity
			String templateFile = getTemplateDir() + templateFilename;
			Template template = engine.getTemplate(templateFile);
			Log.i(String.format("Loaded velocity template: %s", templateFile));

			// Provide velocity with what it needs to fill in the template
			// i.e. the ClassDef
			// but also some macros
			// and helpful routines
			VelocityContext context = new VelocityContext();
			context.put("class", classDef);
			context.put("macros", getTemplateDir() + "macros.vm");
			context.put("Helper", GeneratorHelper.class);

			// Go fill in template.
			// A great quick introduction to velocity syntax is available
			// Here:
			// http://velocity.apache.org/engine/releases/velocity-1.5/user-guide.html
			StringWriter writer = new StringWriter();
			template.merge(context, writer);
			return writer.toString();
		} catch (ResourceNotFoundException e) {
			throw e;
		} catch (Exception e) {

			throw new VelocityException(e.getLocalizedMessage(), e);
		}
	}

	/**
	 * This is the main entry point of this class. It generates the code for a
	 * GOOL class and its corresponding dependent classes.
	 * 
	 * @param pclass
	 *            the class to generate.
	 * @return the list of files of generated concrete target classes
	 * @throws FileNotFoundException
	 * @throws Exception
	 *             when the generated code cannot be written to the file system
	 *             or when there is a parsing error in Velocity templates.
	 *             Side-effects: updates the list of abstract GOOL classes that
	 *             have been processed
	 */
	public List<File> print(ClassDef pclass) throws FileNotFoundException {
		// GOOL library classes are printed in a different manner
		if(pclass.isGoolLibraryClass()){
			return printGoolLibraryClass(pclass);
		}
		
		/*
		 * Delegate the code generation to the ClassDef object, which may decide
		 * that the currentPrinter need be changed since platforms are decided
		 * on a per class basis
		 */
		String code = pclass.getCode();

		// file separator is just a slash in Unix
		// so the second argument to File() is just the directory
		// that corresponds to the package name
		// the first argument is the default output directory of the platform
		// so the directory name ends up being something like
		// GOOLOUPTUTTARGET/pack/age
		File dir = new File(getOutputDir().getAbsolutePath(),
				StringUtils.replace(pclass.getPackageName(), ".",
						File.separator));
		// Typically the outputdir was created before, but not the package
		// subdirs
		dir.mkdirs();
		// Create the file for the class, fill it in, close it
		File classFile = new File(dir, getFileName(pclass.getName()));
		Log.i(String.format("Writing to file %s", classFile));
		PrintWriter writer = new PrintWriter(classFile);
		writer.println(code);
		writer.close();
		// Remember that you did the generation for this one abstract GOOL class
		printedClasses.add(pclass);
		// Put the generated class into the result list
		List<File> result = new ArrayList<File>();
		result.add(classFile);
		// Go through the dependencies
		// If they are abstract GOOL classes and have not been generated, do
		// that
		// And add the generated classes into the result list
		for (Dependency dependency : pclass.getDependencies()) {
			if (!printedClasses.contains(dependency)
					&& dependency instanceof ClassDef) {
				result.addAll(print((ClassDef) dependency));
			}
		}
		return result;
	}
	
	public List<File> printGoolLibraryClass(ClassDef pclass) throws FileNotFoundException {
			String goolClass = pclass.getPackageName()+"."+pclass.getName();
			
			ArrayList<String> goolClassImplems = new ArrayList<String>();
			for(String Import : GeneratorMatcher.matchImports(goolClass))
				if(Import.startsWith("+"))
					goolClassImplems.add(Import.substring(1));
			
			List<File> result = new ArrayList<File>();
			for(String goolClassImplem : goolClassImplems){
				String goolClassImplemName = goolClassImplem.substring(goolClassImplem.lastIndexOf(".")+1);
				String goolClassImplemPackage = goolClassImplem.substring(0, goolClassImplem.lastIndexOf("."));
				String implemFileName = pclass.getPlatform().getCodePrinter().getFileName(goolClassImplemName);
				String code = GeneratorMatcher.matchGoolClassImplementation(goolClass, implemFileName);
				File dir = new File(getOutputDir().getAbsolutePath(),
						StringUtils.replace(goolClassImplemPackage, ".",
								File.separator));
				dir.mkdirs();
				File implemFile = new File(dir, implemFileName);
				PrintWriter writer = new PrintWriter(implemFile);
				writer.println(code);
				writer.close();
			}
			printedClasses.add(pclass);
			return result;
		
	}

	/**
	 * Gets the filename that should be used for the corresponding class. For
	 * example, Java forces the same name to be used for the file and the
	 * (public) class.
	 * 
	 * @param className
	 *            a class name.
	 * @return the correct filename for the specified class.
	 */
	public abstract String getFileName(String className);

	/**
	 * Gets the path where the Velocity templates are located.
	 * 
	 * @return the path where the velocity templates are located.
	 */
	public abstract String getTemplateDir();

	/**
	 * Gets the output directory.
	 * 
	 * @return the output directory.
	 */
	public File getOutputDir() {
		return outputDir;
	}

	private static Map<Platform, CodePrinter> codePrinters = new HashMap<Platform, CodePrinter>();

	public static void registerWriter(Platform platform, CodePrinter writer) {
		codePrinters.put(platform, writer);
	}

	/**
	 * Each platform has specifies a CodePrinter. which itself has a
	 * CodeGenerator this returns that CodePrinter after having set its
	 * CodeGenerator in the GoolGeneratorController
	 */
	public static CodePrinter getPrinter(IType platform) {
		CodePrinter codePrinter = ((Platform) platform).getCodePrinter();
		if (codePrinter == null) {
			throw new IllegalStateException(
					String.format(
							"There are no registered code writers for the specified platform: %s",
							platform));
		}

		GoolGeneratorController
				.setCodeGenerator(codePrinter.getCodeGenerator());
		return codePrinter;
	}

	public void setOutputDir(File outputDir) {
		this.outputDir = outputDir;
	}

	public static Set<Platform> getRegistredPlatforms() {
		return codePrinters.keySet();
	}

	public Collection<File> print(Collection<ClassDef> generatedClassDefs,
			boolean isGool) throws FileNotFoundException {
		Collection<File> result = new ArrayList<File>();
		for (ClassDef classDef : generatedClassDefs) {
			result.addAll(print(classDef));
		}

		return result;
	}

	private boolean CopierFichier(File Source, File Destination)
			throws FileNotFoundException {
		boolean resultat = false;
		FileInputStream filesource = null;
		FileOutputStream fileDestination = null;
		try {
			filesource = new FileInputStream(Source);
			fileDestination = new FileOutputStream(Destination);
			byte buffer[] = new byte[512 * 1024];
			int nblecture;
			while ((nblecture = filesource.read(buffer)) != -1) {
				fileDestination.write(buffer, 0, nblecture);
			}
			resultat = true;
		} catch (FileNotFoundException nf) {
			nf.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			try {
				filesource.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			try {
				fileDestination.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return resultat;
	}

	public List<File> printPersonalLib() throws FileNotFoundException {
		ArrayList<File> r = new ArrayList<File>();
		return r;
	}

	public String processTemplate(String templateFilename, String className) {

		try {
			// Load the template into velocity
			String templateFile = getTemplateDir() + templateFilename;
			Template template = engine.getTemplate(templateFile);

			VelocityContext context = new VelocityContext();
			context.put("class", className);
			context.put("macros", getTemplateDir() + "macros.vm");
			context.put("Helper", GeneratorHelper.class);

			StringWriter writer = new StringWriter();
			template.merge(context, writer);
			return writer.toString();

		} catch (Exception e) {

			throw new VelocityException(e.getLocalizedMessage(), e);
		}
	}
}
