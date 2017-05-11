package com.devnp.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileReadInputStream {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		readWithBuffer2();
	}
	
	/**
	 * 采用单字节的读取方式
	 * @throws IOException
	 */
	public static void read() throws IOException{
		File file = new File("D:\\Person-Test\\1.txt");
		
		InputStream inputStream = new FileInputStream(file);
		
		StringBuilder stringBuilder = new StringBuilder();
		
		int ch ;
		while ((ch = inputStream.read()) != -1) {
			stringBuilder.append((char)ch);
		}
		
		inputStream.close();
		
		System.out.println(stringBuilder);
	}

	/**
	 * 采用缓存的方的，一次性读取10个字节
	 * @throws IOException
	 */
	public static void readWithBuffer() throws IOException{
		File file = new File("D:\\Person-Test\\1.txt");
		
		InputStream inputStream = new FileInputStream(file);
		
		StringBuilder stringBuilder = new StringBuilder();
		
		byte [] bytes = new byte[10] ;
		int n ;
		while (( n = inputStream.read(bytes)) != -1) {
			stringBuilder.append(new String(bytes, 0 , n));
			
		}
		
		inputStream.close();
		
		System.out.println(stringBuilder);
	}
	
	/**
	 * 采用缓存的方的，一次性读取10个字节
	 * @throws IOException
	 */
	public static void readWithBuffer2() throws IOException{
		File file = new File("D:\\Person-Test\\1.txt");
		
		InputStream inputStream = new FileInputStream(file);
		
		StringBuilder stringBuilder = new StringBuilder();
		
		byte [] bytes = new byte[10] ;
		int n ;
		while (( n = inputStream.read(bytes, 0, bytes.length)) != -1) {
			stringBuilder.append(new String(bytes, 0 , n));
			
		}
		
		inputStream.close();
		
		System.out.println(stringBuilder);
	}
}
