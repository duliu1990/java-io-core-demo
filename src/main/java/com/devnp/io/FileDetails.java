package com.devnp.io;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileDetails {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fileDetails();
	}

	public static void fileDetails(){
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		
		File file = new File("D:\\Person-Test\\5.pdf");
		
		System.out.println("File Exists : " + file.exists()); //文件或文件夹是否存在
		
		System.out.println("Last Modified : " + sdf.format(file.lastModified())); //文件或文件夹最近更新时间
		
		System.out.println("File Size : " + file.length() / 1024 + " kb"); //文件或文件夹大小
		
		System.out.println("File Path : " + file.getAbsolutePath()); //文件或文件夹路径
		
		System.out.println("File Can Wirte : " + file.canWrite()); //文件或文件夹是否可读
		
		System.out.println("File is Hidden : " + file.isHidden()); //文件或文件夹是否是隐藏
	}
}
