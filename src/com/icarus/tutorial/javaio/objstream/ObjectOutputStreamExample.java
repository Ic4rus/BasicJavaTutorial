package com.icarus.tutorial.javaio.objstream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class ObjectOutputStreamExample {
	
	public static void main(String[] args) {
		
		try {
			// Tạo 1 luồng ghi vào file
			FileOutputStream fos = new FileOutputStream("testObjectStream.txt");
			
			// Tạo 1 đối tượng ObjectOutputStream bao lấy 'fos'
			// Những gì ghi vào luồng này sẽ được đẩy xuống 'fos'
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			// Ghi 1 String vào luồng
			oos.writeUTF("This is student, pupil profiles");
			
			// Ghi 1 đối tượng Date vào luồng
			oos.writeObject(new Date());
			
			Student student1 = new Student("Thanh", "Phan");
			Student student2 = new Student("Ngan", "Tran");
			Pupil pupil1 = new Pupil("Nguyen Van Ba");
			
			oos.writeObject(student1);
			oos.writeObject(pupil1);
			oos.writeObject(student2);
			
			oos.close();
			System.out.println("Write successful");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
