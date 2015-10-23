package com.icarus.tutorial.javaio.filter;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringReader;

public class RemoveHTMLReaderTest {
	
	public static void main(String[] args) {
		
		try {
			// Tạo 1 luồng vào từ chuỗi
			Reader reader = new StringReader("<h1>Hello \n <b>World</b><h1>");

			RemoveHTMLReader filterReader = new RemoveHTMLReader(reader);
			BufferedReader br = new BufferedReader(filterReader);

			String s = null;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
