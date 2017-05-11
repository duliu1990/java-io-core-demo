package com.devnp.zip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CompressionFileInZip {

	public static void main(String[] args) {
		// 将5.pdf 压缩成 test.zip
		File inFile = new File("D:\\Person-Test\\temp\\5.pdf");
		
		File outFile = new File("D:\\Person-Test\\temp\\test.zip");
		
		compressionInZip(inFile, outFile);
	}

	public static void compressionInZip(File inFile, File outFile) {

		FileOutputStream fos = null;
		ZipOutputStream zos = null;
		FileInputStream in = null;

		try {
			fos = new FileOutputStream(outFile);

			zos = new ZipOutputStream(fos);

			ZipEntry ze = new ZipEntry(inFile.getName());

			zos.putNextEntry(ze);

			in = new FileInputStream(inFile);

			byte[] buffer = new byte[1024];
			int len;
			while ((len = in.read(buffer)) > 0) {
				zos.write(buffer, 0, len);
			}
			
			if (ze != null)
				zos.closeEntry();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (in != null)
					in.close();

				if (zos != null)
					zos.close();

				if (fos != null)
					fos.close();

			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		
		System.out.println("Compression In Zip is Success.");

	}
}
