package com.devnp.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileObjectWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student("Du Liu", 26);
		
		writeObj(student);
	}
	
	public static void writeObj(Student student){
		
		FileOutputStream fout = null;
		ObjectOutputStream oos = null;
		
		try {

			fout = new FileOutputStream("D:\\Person-Test\\temp\\sudent.txt");
			oos = new ObjectOutputStream(fout);
			oos.writeObject(student);

			System.out.println("Write " + student.getClass().getName() + " is Success.");

		} catch (Exception ex) {

			ex.printStackTrace();

		} finally {
			try {
				if(fout != null)
					fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				if(oos != null)
					oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
