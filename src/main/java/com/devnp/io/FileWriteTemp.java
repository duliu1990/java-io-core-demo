package com.devnp.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTemp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = File.createTempFile("2017-04-12-file-", ".temp");
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
		
		bufferedWriter.write("This is temp file.");
		
		bufferedWriter.close();
		
		System.out.println("Temp File Path : " + file.getAbsolutePath());
		
		
	}

}
