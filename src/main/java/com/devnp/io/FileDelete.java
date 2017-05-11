package com.devnp.io;

import java.io.File;

public class FileDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("D:\\Person-Test\\1.txt");
		
		if(file.delete()){
			System.out.println(file.getName() + " deleted success.");
		}
	}

}
