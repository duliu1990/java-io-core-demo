package com.devnp.io;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("D:\\Person-Test\\1.txt");
		
		//check the file exist or not
		if(file.exists()){
			System.out.println("File Aready Exist.");
		}else {
			file.createNewFile();
			
			System.out.println("Create File Success.");
		}
	}

}
