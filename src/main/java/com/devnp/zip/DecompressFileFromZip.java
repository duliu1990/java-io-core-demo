package com.devnp.zip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class DecompressFileFromZip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String outFolder = "D:\\Person-Test\\temp\\" ;
		
		File zipFile = new File("D:\\Person-Test\\test.zip");
		
		decompressFile(zipFile, outFolder);
	}

	public static void decompressFile(File zipFile, String outFolder) {
		ZipInputStream zis = null;
		ZipEntry ze = null;

		try {
			zis = new ZipInputStream(new FileInputStream(zipFile));

			//list all file
			while ((ze = zis.getNextEntry()) != null) {
				String fileName = ze.getName();

				File file = new File(outFolder + File.separator + fileName);
				
				new File(file.getParent()).mkdirs(); //创建文件夹，如果不存
				
				System.out.println("File Name : " + fileName);

				FileOutputStream fos = new FileOutputStream(file);

				byte[] buffer = new byte[1024];
				int len;
				while ((len = zis.read(buffer)) > 0) {
					fos.write(buffer, 0, len);
				}
				
				fos.close();

			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(zis != null)
					zis.close();
			} catch (IOException e) {
				// TODO: handle exception
			}
		}
		
		System.out.println("Decompression From Zip is Success.");
	}

}
