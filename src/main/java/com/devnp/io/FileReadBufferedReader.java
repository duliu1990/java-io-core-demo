package com.devnp.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadBufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("D:\\Person-Test\\1.txt");
		InputStreamReader isr = null;
		BufferedReader bis = null;

		StringBuilder stringBuilder = new StringBuilder();
		try {
			isr = new InputStreamReader(new FileInputStream(file));

			bis = new BufferedReader(isr);
			
			String str ;
			
			while ((str = bis.readLine()) != null) {
				stringBuilder.append(str);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				isr.close();
				bis.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
		System.out.println(stringBuilder);
	}

}
