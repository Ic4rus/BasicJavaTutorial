package com.icarus.tutorial.javaiozip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnZipDemo {
	
	public static void main(String[] args) {
		
		final String OUTPUT_FOLDER = "output";
		String FILE_PATH = "datas.zip";
		
		// Tạo thư mục Output nếu chưa có
		File folder = new File(OUTPUT_FOLDER);
		if (!folder.exists()) {
			folder.mkdirs();
		}
		// Bộ đệm
		byte[] buffer = new byte[1024];
		
		ZipInputStream zipIS = null;
		try {
			// Khởi tạo ZipInputStream
			zipIS = new ZipInputStream(new FileInputStream(FILE_PATH));
			
			ZipEntry entry = null;
			// Duyệt từng Entry (Từ trên xuống dưới cho tới hết)
			while ((entry=zipIS.getNextEntry()) != null) {
				String entryName = entry.getName();
				String outFileName = OUTPUT_FOLDER + File.separator + entryName;
				System.out.println("Unzip: " + outFileName);
				if (entry.isDirectory()) {
					new File(outFileName).mkdirs();
				} else {
					// Tạo luồng ghi ra file
					FileOutputStream fos = new FileOutputStream(outFileName);
					
					int len;
					// Đọc dữ liệu tại Entry hiện tại
					while ((len = zipIS.read(buffer)) > 0) {
						fos.write(buffer, 0, len);
					}
					fos.close();
				}
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
