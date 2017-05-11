package com.devnp.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteBufferedWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		write();
	}
	
	public static void write() throws IOException{
		File file = new File("D:\\Person-Test\\1.txt");
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
		
		String str = "Hi, Hello, I'm devnp.com" ;
		
		bufferedWriter.write(str.toCharArray()); //写入整个char数组
		
		bufferedWriter.write(65); //写入A
		
		bufferedWriter.write(str.toCharArray(), 0, str.length()); //以char的方式写入，从0开始写入str的长度
			
		bufferedWriter.write(str); //写入str
		
		bufferedWriter.write(str, 0, str.length()); //写入str, 从第0个位置开始，连续学如str的长度
		
		bufferedWriter.close();
	}

}
