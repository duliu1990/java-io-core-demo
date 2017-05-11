package com.devnp.system;

public class CurrentSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Java Version : " + System.getProperty("java.version")); 	//Java 版本
		System.out.println("Java Vendor : " + System.getProperty("java.vendor")); 	//Java 供应商
		System.out.println("Java vendor URL : " + System.getProperty("java.vendor.url")); 	//Java 供应商URL地址
		
		System.out.println("Java Installation Directory : " + System.getProperty("java.home")); 	//Java 安装路径
		System.out.println("Java class version number : " + System.getProperty("java.class.version")); 	//Java 版本号
		System.out.println("Java classpath : " + System.getProperty("java.class.path"));	//Java 类路径
		
		System.out.println("Operating System Name : " + System.getProperty("os.name"));		//操作系统名称
		System.out.println("Operating System Architecture : " + System.getProperty("os.arch"));		//操作系统架构
		System.out.println("Operating System Version : " + System.getProperty("os.version"));		//操作系统版本
		
		System.out.println("File separator : " + System.getProperty("file.separator"));		//文件分隔符
		System.out.println("Path separator : " + System.getProperty("path.separator"));		//路径分隔符
		System.out.println("Line separator : " + System.getProperty("line.separator"));		//行分隔符
		
		System.out.println("User account name : " + System.getProperty("user.name"));	//用户帐号名称
		System.out.println("User home directory : " + System.getProperty("user.home"));		//用户主目录
		System.out.println("User current working directory : " + System.getProperty("user.dir"));	//用户当前工作目录
		
	}

}
