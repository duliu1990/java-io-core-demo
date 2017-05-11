package com.devnp.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileWriteFileOutputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		writer();
	}
	
	public static void writer() throws IOException{
		File file = new File("D:\\Person-Test\\1.txt");
		
		String str = "Hi, Hello, I'm devnp.com" ;
				
		OutputStream outputStream = new FileOutputStream(file);
		
		outputStream.write(65);	//this is not 65, is 'A' 
		outputStream.write(str.getBytes());
		outputStream.write(str.getBytes(), 0, 2);
		
		outputStream.close();
	}

}
