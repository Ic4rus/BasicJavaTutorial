package com.icarus.tutorial.javaio.objstream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Date;

public class ObjectInputStreamExample {
	
	public static void main(String[] args) {
		
		try {
			// Tạo 1 luồng đọc file
			FileInputStream fis = new FileInputStream("testObjectStream.txt");
			
			// Tạo 1 đối tượng ObjectInputStream bao lấy 'fis'
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			// Đọc ra đối tượng String
			String s = ois.readUTF();
			System.out.println(s);
			
			// Đọc ra đối tượng Date
			Date date = (Date) ois.readObject();
			System.out.println("Date= " + date);
			
			Student student1 = (Student) ois.readObject();
			System.out.println("Student= " + student1.getFirstName());
			
			Pupil pupil = (Pupil) ois.readObject();
			System.out.println("Pupil= " + pupil.getFullName());
			
			Student student2 = (Student) ois.readObject();
			System.out.println("Student= " + student2.getFirstName());
			
			ois.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
