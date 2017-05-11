package com.devnp.io;

import java.io.File;
import java.io.IOException;

public class FileDeleteTemp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = File.createTempFile("2017-04-12-file-", ".temp");
		
		System.out.println("Temp File Path : " + file.getAbsolutePath());
		
		//file.delete() ;
		
		file.deleteOnExit();
	}

}
