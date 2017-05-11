package com.devnp.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileMove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rename();
		//copy();
	}
	
	/**
	 * 通过Rename方式的来实现文件的移动
	 */
	public static void rename(){
		File file = new File("D:\\Person-Test\\1.txt");
		File newfile = new File("D:\\Person-Test\\1_new.txt");
		
		if(file.renameTo(newfile)){
			System.out.println("File Rename succesful.");
		}
		
	}
	
	/**
	 * 通过文件的拷贝的方式来实现文件的移动， 拷贝完成新文件之后在删除源文件
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
	    	    
	    	    afile.delete();

	    	}catch(IOException e){
	    		e.printStackTrace();
	    	}
	    	
	}

}
