package com.devnp.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class FileObjectRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = readObj(new File("D:\\Person-Test\\temp\\sudent.txt"));
		
		System.out.println("Sudent Name : " + student.getName() + ", Age : " + student.getAge());
	}

	public static Student readObj(File file) {
		FileInputStream fin = null;
		ObjectInputStream ois = null;

		Student student = null;
		try {

			fin = new FileInputStream(file);
			ois = new ObjectInputStream(fin);
			student = (Student) ois.readObject();

		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if (fin != null)
					fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				if (ois != null)
					ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

		return student;

	}

}
