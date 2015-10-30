package com.icarus.tutorial.javaiozip;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ListZipEntriesDemo {
	
	public static void main(String[] args) {
		
		String FILE_PATH = "datas.zip";
		
		ZipInputStream zipIS = null;
		try {
			// Khởi tạo ZipInputStream
			zipIS = new ZipInputStream(new FileInputStream(FILE_PATH));
			
			ZipEntry entry = null;
			
			// Duyệt từng entry (Từ trên xuống dưới cho tới hết)
			while ((entry = zipIS.getNextEntry()) != null) {
				if (entry.isDirectory()) {
					System.out.print("Directory: ");
				} else {
					System.out.print("File: ");
				}
				System.out.println(entry.getName());
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				zipIS.close();
			} catch (IOException e) {
			}
		}
	}

}
