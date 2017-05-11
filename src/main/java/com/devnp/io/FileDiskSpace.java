package com.devnp.io;

import java.io.File;

public class FileDiskSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("D:");
		
		long totalSpace = file.getTotalSpace(); 	//磁盘总容量
    	long usableSpace = file.getUsableSpace(); 	//磁盘可用容量
    	long freeSpace = file.getFreeSpace(); 	//磁盘空闲容量
    	
    	System.out.println("Disk Total Size : " + totalSpace + " bytes");
    	System.out.println("Disk Usable Size : " + usableSpace + " bytes");
    	System.out.println("Disk Free Size : " + freeSpace + " bytes");
	}

}
