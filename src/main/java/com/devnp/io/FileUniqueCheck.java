package com.devnp.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class FileUniqueCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("D:\\Person-Test\\5.pdf");
		
		System.out.println("File MD5 Value ： " + generateMD5(file));
		System.out.println("File SHA1 Value ： " + generateSHA(file));
	}
	
	public static String generateMD5(File file){
		StringBuffer sb = new StringBuffer();
		MessageDigest md = null;
		FileInputStream fis = null ;
		try {
			md = MessageDigest.getInstance("MD5");
			
			fis = new FileInputStream(file);
		    
		    byte[] dataBytes = new byte[1024];

		    int nread = 0;

		    while ((nread = fis.read(dataBytes)) != -1) {
		      md.update(dataBytes, 0, nread);
		    };

		    byte[] mdbytes = md.digest();

		    //将字节码变成16进制数据
		    
		    for (int i = 0; i < mdbytes.length; i++) {
		    	sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
		    }
		    
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(fis != null)
					fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	    return sb.toString() ;
	}
	
	public static String generateSHA(File file){
		StringBuffer sb = new StringBuffer();
		MessageDigest md = null;
		FileInputStream fis = null ;
		try {
			md = MessageDigest.getInstance("SHA1");
			
			fis = new FileInputStream(file);
		    
		    byte[] dataBytes = new byte[1024];

		    int nread = 0;

		    while ((nread = fis.read(dataBytes)) != -1) {
		      md.update(dataBytes, 0, nread);
		    };

		    byte[] mdbytes = md.digest();

		    //将字节码变成16进制数据
		    
		    for (int i = 0; i < mdbytes.length; i++) {
		    	sb.append(Integer.toString((mdbytes[i] & 0xff) + 0x100, 16).substring(1));
		    }
		    
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(fis != null)
					fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	    return sb.toString() ;
	}

}
