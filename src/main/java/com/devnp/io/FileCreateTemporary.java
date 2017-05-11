package com.devnp.io;

import java.io.File;
import java.io.IOException;

public class FileCreateTemporary {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		createTempfile();
		createTempfileWithDir();
	}
	
	/**
	 * 使用默认路径来保存临时文件
	 * @throws IOException
	 */
	public static void createTempfile() throws IOException{
		File file = File.createTempFile("2017-04-12-file-", ".temp");
		
		System.out.println("Temp File Path : " + file.getAbsolutePath());
	}
	
	/**
	 * 使用指定路径来保存临时文件
	 * @throws IOException
	 */
	public static void createTempfileWithDir() throws IOException{
		File file = File.createTempFile("2017-04-12-file-", ".temp", new File("C:\\"));
		
		System.out.println("Temp File Path : " + file.getAbsolutePath());
	}

}
