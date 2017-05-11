package com.devnp.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaExcuteCmd {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.out.println(excuteCmd("ping www.devnp.com"));
		
		System.out.println(excuteCmd("ping www.google.com"));
	}
	
	public static String excuteCmd(String cmd){
		StringBuilder stringBuilder = new StringBuilder();
		
		try {
			Process process = Runtime.getRuntime().exec(cmd);

			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));

			String line = "";
			while ((line = bufferedReader.readLine()) != null) {
				stringBuilder.append(line + "\r\n" );
			}

			bufferedReader.close();
		} catch (IOException e) {
			// TODO: handle exception
			
			System.err.println(e);
		}
		
		return stringBuilder.toString() ;
	}
	
}
