package com.devnp.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		copy();
	}
	
	/**
	 * Use FileInputStream read file and FileOutputStream write file
	 */
	public static void copy(){
		InputStream inStream = null;
		OutputStream outStream = null;

	    	try{

	    	    File afile =new File("D:\\Person-Test\\1.txt");
	    	    File bfile =new File("D:\\Person-Test\\2.txt");

	    	    inStream = new FileInputStream(afile);
	    	    outStream = new FileOutputStream(bfile);

	    	    byte[] buffer = new byte[1024];

	    	    int length;
	    	    //copy the file content in bytes
	    	    while ((length = inStream.read(buffer)) > 0){

	    	    	outStream.write(buffer, 0, length);

	    	    }

	    	    inStream.close();
	    	    outStream.close();

	    	    System.out.println("File is copied successful!");

	    	}catch(IOException e){
	    		e.printStackTrace();
	    	}
	}

}
