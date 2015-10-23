package com.icarus.tutorial.generics.ci;

// Class này mở rộng từ class KeyValue<Integer, String>
// Chỉ định rõ K, v
// K = Integer (Số điện thoại)
// V = String (Tên Người dùng)
public class PhoneNameEntry extends KeyValue<Integer, String> {
	
	public PhoneNameEntry(Integer key, String value) {
		super(key, value);
	}

}
