








// Platform: JAVA

package gool.imports.java.io;
import gool.imports.java.io.GoolFile;
import java.io.File;
import java.io.FileWriter;




public  class GoolFileWriter  {

    private FileWriter outputlangobject;
    private String filename;

		public GoolFileWriter(GoolFile goolFile){
		try{
		this.outputlangobject = new FileWriter(goolFile.getOutputlangobject());
		this.filename = goolFile.getFilename();
		}catch(Exception e){
		System.out.println(e.toString());
		}
	}


		public GoolFileWriter(String name){
		try{
		this.outputlangobject = new FileWriter(name);
		this.filename = name;
		}catch(Exception e){
		System.out.println(e.toString());
		}
	}


		public String getFilename(){
		return this.filename;
	}


		public FileWriter getOutputlangobject(){
		return this.outputlangobject;
	}


}
