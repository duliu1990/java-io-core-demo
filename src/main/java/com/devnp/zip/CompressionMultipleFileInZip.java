package com.devnp.zip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CompressionMultipleFileInZip {
	
	static List<File> fileList ;
	static final String SOURCE_FOLDER = "D:\\Person-Test\\temp\\" ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File inFile = new File(SOURCE_FOLDER);
		
		fileList = new ArrayList<File>() ;
		
		getAllFileList(inFile) ; //获取所有文件
		
		File outFile = new File("D:\\Person-Test\\test.zip");	//压缩文件生成地址
		
		compressionInZip(outFile, fileList);
	}
	
	/**
	 * 获取文件下面的所有文件
	 * @param file
	 */
	public static void getAllFileList(File file){
		if(file.isFile())
			fileList.add(file) ;
		else {
			File[] files = file.listFiles() ;
			
			for (int i = 0; i < files.length; i++) {
				getAllFileList(files[i]) ;
			}
		}
		
	}
	
	public static void compressionInZip(File outFile, List<File> inFile) {

		FileOutputStream fos = null;
		ZipOutputStream zos = null;
		FileInputStream in = null;

		try {
			fos = new FileOutputStream(outFile);

			zos = new ZipOutputStream(fos);
			
			for (int i = 0; i < inFile.size(); i++) {
				
				String zipName = getZipEntryName(inFile.get(i).getAbsolutePath()) ;
				
				System.out.println("Zip File Name : " + zipName);
				
				ZipEntry ze = new ZipEntry(zipName);

				zos.putNextEntry(ze);
				
				in = new FileInputStream(inFile.get(i));

				byte[] buffer = new byte[1024];
				int len;
				while ((len = in.read(buffer)) > 0) {
					zos.write(buffer, 0, len);
				}
				
				if (ze != null)
					zos.closeEntry();
			}

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
	
	/**
	 * 根据文件绝对路径，截取压缩文件名
	 * @param fileAbsolutePath
	 * @return
	 */
	public static String getZipEntryName(String fileAbsolutePath){
		
		return fileAbsolutePath.substring(SOURCE_FOLDER.length());
	}

}
