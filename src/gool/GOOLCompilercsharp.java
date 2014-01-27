
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

/**
 * The class that launches the other ones, thereby controlling the workflow.
 * TODO: further parameterize concreteJavaToConcretePlatform() to have an input platform. 
 * TODO: do the wrapping of the different input formats at this stage rather than in JavaParser.
 * TODO: return packages instead of ClassDefs.
 */

package gool;

import gool.ast.core.ClassDef;
import gool.generator.GeneratorHelper;
import gool.generator.common.Platform;
import gool.generator.csharp.CSharpPlatform;
import gool.generator.java.JavaPlatform;
import gool.recognizer.csharp.CsharpRecognizer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import logger.Log;

public class GOOLCompilercsharp {

        /**
         * The main - gets the folder to open from Settings - opens the files -
         * creates an instance of this class - triggers it upon the files, with
         * argument the target platform.
         */
        public static void main(String[] args) {

                try {
                        File folder = new File(Settings.get("csharp_in_dir"));
                        Collection<File> files = getFilesInFolder(folder, "cs");
                        ArrayList<String> extToNCopy = new ArrayList<String>();
                        try {
                                File t = new File(Settings.get("csharp_in_dir") + File.separator
                                                + ".goolIgnore");
                                FileReader f = new FileReader(t);
                                BufferedReader g = new BufferedReader(f);
                                String ligne;
                                while ((ligne = g.readLine()) != null)
                                        extToNCopy.add(ligne);
                        } catch (Exception e) {
                                Log.e(e);
                        }

                        Collection<File> filesNonChange = getFilesInFolderNonExe(folder,
                                        extToNCopy);

                        concretecsharpToConcretePlatform(
                                        JavaPlatform.getInstance(filesNonChange), files);
                        concretecsharpToConcretePlatform(
                                        CSharpPlatform.getInstance(filesNonChange), files);
                } catch (Exception e) {
                        Log.e(e);
                }
        }

        public static Collection<File> getFilesInFolder(File folder, String ext) {
                Collection<File> files = new ArrayList<File>();
                for (File f : folder.listFiles()) {
                        if (f.isDirectory()) {
                                files.addAll(getFilesInFolder(f, ext));
                        } else if (f.getName().endsWith(ext)) {
                                files.add(f);
                        }
                }
                return files;
        }

        private static Collection<File> getFilesInFolderNonExe(File folder,
                        ArrayList<String> ext) {

                Collection<File> files = new ArrayList<File>();

                for (File f : folder.listFiles()) {
                        if (f.isDirectory()) {
                                files.addAll(getFilesInFolderNonExe(f, ext));
                        } else {
                                boolean trouve = false;
                                for (String s : ext) {
                                        if (f.getName().endsWith(s))
                                                trouve = true;
                                }
                                if (!trouve)
                                        files.add(f);
                                trouve = false;

                        }
                }
                return files;
        }

      

      

        /**
         * Flattening the abstract GOOL into concrete Target is done by
         * GeneratorHelper.
         * 
         * @param classDefs
         * @return a map of the compiled files for the different platforms
         * @throws FileNotFoundException
         */
        private static Map<Platform, List<File>> abstractGool2Target(
                        Collection<ClassDef> classDefs) throws FileNotFoundException {
                return GeneratorHelper.printClassDefs(classDefs);
        }

      
        public static Map<Platform, List<File>> concretecsharpToConcretePlatform(
                        Platform destPlatform, Collection<? extends File> inputFiles)
                        throws Exception {
     
                return abstractGool2Target(CsharpRecognizer.parseGool(destPlatform, inputFiles));
        }

       

}