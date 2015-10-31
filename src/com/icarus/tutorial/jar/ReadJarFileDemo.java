package com.icarus.tutorial.jar;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.jar.Attributes;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.util.jar.Manifest;

public class ReadJarFileDemo {

	public static void main(String[] args) {

		String FILE_PATH = "D:/Projects/Java/Core/BasicJavaTutorial/libs/gson-2.2.2.jar";

		JarInputStream jis = null;

		try {
			jis = new JarInputStream(new FileInputStream(FILE_PATH));

			// Đọc thông tin Manifest
			Manifest manifest = jis.getManifest();
			Attributes atts = manifest.getMainAttributes();
			String version = atts.getValue("Manifest-Version");
			String createdBy = atts.getValue("Created-By");
			System.out.println("Manifest-Version:" + version);
			System.out.println("Created-By:" + createdBy);
			System.out.println("=============================");
			JarEntry entry = null;
			// Duyệt từng entry từ trên xuống dưới cho tới hết
			while ((entry = jis.getNextJarEntry()) != null) {
				if (entry.isDirectory()) {
					System.out.print("Folder: ");
				} else {
					System.out.print("File: ");
				}
				System.out.println(entry.getName());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				jis.close();
			} catch (IOException e) {
			}
		}

	}

}
