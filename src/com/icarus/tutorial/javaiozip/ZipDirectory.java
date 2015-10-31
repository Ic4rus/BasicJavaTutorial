package com.icarus.tutorial.javaiozip;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipDirectory {
	
	public ZipDirectory() {
		
	}
	
	/**
	 * Method nén 1 thư mục
	 */
	public void zipDirectory(File inputDir, File outputZipFile) {
		// Tạo thư mục cha cho file output
//		outputZipFile.getParentFile().mkdirs();
		
		String inputDirPath = inputDir.getAbsolutePath();
		byte[] buffer = new byte[1024];
		
		FileOutputStream fos = null;
		ZipOutputStream zipOS = null;
		try {
			// Tất cả file con, cháu trong thư mục inputDir
			List<File> allFiles = this.listChildFiles(inputDir);
			// Bây giờ thì zip lần lượt từng file
			// Tạo ZipOutputStream để ghi file zip
			fos = new FileOutputStream(outputZipFile);
			zipOS = new ZipOutputStream(fos);
			for (File file : allFiles) {
				String filePath = file.getAbsolutePath();
				System.out.println("Zipping " + filePath);
				// entryName chính là đường dẫn tương đối
				String entryName = filePath.substring(inputDirPath.length() + 1);
				
				ZipEntry ze = new ZipEntry(entryName);
				// Thêm entry vào file zip
				zipOS.putNextEntry(ze);
				// Đọc dữ liệu file cần zip và ghi vào luồng zip
				FileInputStream fis = new FileInputStream(file);
				int len;
				while ((len = fis.read(buffer)) > 0) {
					zipOS.write(buffer, 0, len);
				}
				fis.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			closeQuite(zipOS);
			closeQuite(fos);
		}
	}
	
	private void closeQuite(OutputStream out) {
		try {
			out.close();
		} catch (IOException e) {
		}
	}
	
	/**
	 * Method trả về danh sách các file, bao gồm cả cháu chắt của thư mục 
	 * @param dir
	 * @return
	 */
	private List<File> listChildFiles(File dir) throws IOException {
		List<File> allFiles = new ArrayList<File>();
		
		// Danh sách các file con trực tiếp của thư mục
		File[] childFiles = dir.listFiles();
		for (File file : childFiles) {
			if (file.isFile()) {
				allFiles.add(file);
			} else {
				// Gọi đệ quy
				List<File> files = this.listChildFiles(file);
				allFiles.addAll(files);
			}
		}
		return allFiles;
	}
	
	public static void main(String[] args) {
		ZipDirectory zipDir = new ZipDirectory();
		File inputDir = new File("output");
		File outputZipFile = new File("datas2.zip");
		zipDir.zipDirectory(inputDir, outputZipFile);
	}

}
