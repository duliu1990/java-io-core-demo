package com.devnp.io;

import java.io.File;

public class FileRename {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("D:\\Person-Test\\1.txt");
		File newfile = new File("D:\\Person-Test\\1_new.txt");
		
		if(file.renameTo(newfile)){
			System.out.println("File Rename succesful.");
		}
	}

}
