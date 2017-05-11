package com.devnp.io;

import java.io.File;

public class FileDeleteDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("D:\\Person-Test\\temp\\1");

		deleteDirectory(file);
	}

	public static void deleteDirectory(File file) {

		if (file.isDirectory()) {
			//如果目录为空，则直接删除
			if (file.list().length == 0) {
				file.delete();

				System.out.println("Directory is deleted : " + file.getAbsolutePath());
			} else {
				File [] files = file.listFiles();

				for (File temp : files) {
					deleteDirectory(temp);
				}
				
				//当删除完成目录下面的所有文件，再来删除目录本身
				if (file.list().length == 0) {
					file.delete();
					System.out.println("Directory is deleted : " + file.getAbsolutePath());
				}
			}
		} else {
			//删除文件
			file.delete();
			
			System.out.println("File is deleted : " + file.getAbsolutePath());
		}
	}

}
