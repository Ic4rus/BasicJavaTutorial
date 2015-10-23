package com.icarus.tutorial.javaio.datastream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamExample {
	
	public static void main(String[] args) {
		
		try {
			
			int cityIdA = 1;
			String cityNameA = "Green Lake City";
			int cityPopulationA = 500000;
			float cityTempA = 15.50f;
			
			int cityIdB = 2;
			String cityNameB = "Salt Lake City";
			int cityPopulationB = 250000;
			float cityTempB = 10.45f;
			
			// Tạo 1 đối tượng FileOutputStream để ghi xuống file
			FileOutputStream fos = new FileOutputStream("cities.txt");
			
			// Tạo 1 đối tượng DataOutputStream bao lấy 'fos'
			// Dữ liệu ghi vào 'dos' sẽ được đẩy sang 'fos'
			DataOutputStream dos = new DataOutputStream(fos);
			
			// Ghi các dữ liệu vào luồng
			dos.writeInt(cityIdA);
			dos.writeUTF(cityNameA);
			dos.writeInt(cityPopulationA);
			dos.writeFloat(cityTempA);
			
			dos.writeInt(cityIdB);
			dos.writeUTF(cityNameB);
			dos.writeInt(cityPopulationB);
			dos.writeFloat(cityTempB);
			
			dos.flush();
			dos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
