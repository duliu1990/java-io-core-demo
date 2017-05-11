package com.devnp.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteAppend {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		write();
		
		writeAppend();
	}
	
	public static void write() throws IOException{
		File file = new File("D:\\Person-Test\\1.txt");
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
		
		String str = "Hi, Hello, I'm devnp.com" ;
		
		bufferedWriter.write(str); //写入str
		
		bufferedWriter.close();
	}
	
	public static void writeAppend() throws IOException{
		File file = new File("D:\\Person-Test\\1.txt");
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
		
		String str = "Hi, Hello, I'm devnp.com too" ;
		
		bufferedWriter.write(str); //写入str
		
		bufferedWriter.close();
	}

}
