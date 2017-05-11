package com.devnp.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//createDir();
		//createDirs();
		//createDirectory();
		createDirectories();
	}
	
	/**
	 * 单一目录
	 */
	public static void createDir(){
		File file = new File("C:\\test");
		
		boolean flag = false ;
		
		if(!file.exists())
			flag = file.mkdir();
		
		if(flag){
			System.out.println("Create Directory is Success.");
		}else {
			System.out.println("Create Directory is Failed.");
		}
	}
	
	/**
	 * 多级目录
	 */
	public static void createDirs(){
		File file = new File("C:\\test\\test");
		
		boolean flag = false ;
		if(!file.exists())
			flag = file.mkdirs();
		
		if(flag){
			System.out.println("Create Directory is Success.");
		}else {
			System.out.println("Create Directory is Failed.");
		}
	}
	
	/**
	 * 单一目录
	 */
	public static void createDirectory(){
		Path path = Paths.get("C:\\test");
		
		if (!Files.exists(path))
			try {
				Files.createDirectory(path);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	

	/**
	 * 多级目录
	 */
	public static void createDirectories(){
		Path path = Paths.get("C:\\test\\test");
		
		if (!Files.exists(path))
			try {
				Files.createDirectories(path);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
