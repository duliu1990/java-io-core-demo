package com.devnp.io;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileInfoUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fileInfoUpdate();
	}
	
	public static void fileInfoUpdate(){
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		
		File file = new File("D:\\Person-Test\\5.pdf");
		
		System.out.println("Last Modified : " + sdf.format(file.lastModified())); //文件或文件夹最近更新时间
		
		file.setLastModified(System.currentTimeMillis()) ;
		
		System.out.println("Last Modified : " + sdf.format(file.lastModified())); //文件或文件夹最近更新时间
		
		System.out.println("File Can Wirte : " + file.canWrite()); //文件或文件夹是否可读
		
		file.setReadOnly() ;
		
		System.out.println("File Can Wirte : " + file.canWrite()); //文件或文件夹是否可读
		
	}

}
