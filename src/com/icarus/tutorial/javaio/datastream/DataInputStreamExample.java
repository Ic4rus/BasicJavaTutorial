package com.icarus.tutorial.javaio.datastream;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamExample {
	
	public static void main(String[] args) {
		
		try {
			// Luồng đọc dữ liệu từ file
			FileInputStream fis = new FileInputStream("cities.txt");
			
			// Tạo đối tượng DataInputStream bao lấy 'fis'
			DataInputStream dis = new DataInputStream(fis);
			
			int cityId1 = dis.readInt();
			System.out.println("Id: " + cityId1);
			String cityName1 = dis.readUTF();
			System.out.println("Name: " + cityName1);
			int cityPopulation1 = dis.readInt();
			System.out.println("Population: " + cityPopulation1);
			float cityTemperature1 = dis.readFloat();
			System.out.println("Temperature: " + cityTemperature1);
			
			int cityId2 = dis.readInt();
			System.out.println("Id: " + cityId2);
			String cityName2 = dis.readUTF();
			System.out.println("Name: " + cityName2);
			int cityPopulation2 = dis.readInt();
			System.out.println("Population: " + cityPopulation2);
			float cityTemperature2 = dis.readFloat();
			System.out.println("Temperature: " + cityTemperature2);
			
			dis.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
