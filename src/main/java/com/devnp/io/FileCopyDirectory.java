package com.devnp.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyDirectory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File src = new File("D:\\Person-Test\\temp\\2");
		File dest = new File("D:\\Person-Test\\temp\\3");
		
		copyDirectory(src, dest);
	}

	public static void copyDirectory(File src, File dest) {
		if (src.isDirectory()) {
			if (!dest.exists()) {
				dest.mkdirs();
			}

			String files[] = src.list();

			for (String file : files) {
				
				File srcFile = new File(src, file);
				File destFile = new File(dest, file);

				copyDirectory(srcFile, destFile);
			}
		} else {
			copy(src, dest);
		}
	}

	/**
	 * Copy the file
	 * 
	 * @param src
	 * @param dest
	 */
	public static void copy(File src, File dest) {
		InputStream inStream = null;
		OutputStream outStream = null;
		
		try {
			
			inStream = new FileInputStream(src);
			outStream = new FileOutputStream(dest);

			byte[] buffer = new byte[1024];

			int length;
			// copy the file content in bytes
			while ((length = inStream.read(buffer)) > 0) {

				outStream.write(buffer, 0, length);
			}

			inStream.close();
			outStream.close();

			System.out.println("File is copied successful!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
