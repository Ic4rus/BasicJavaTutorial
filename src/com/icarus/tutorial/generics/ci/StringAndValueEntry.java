package com.icarus.tutorial.generics.ci;

public class StringAndValueEntry<V> extends KeyValue<String, V> {
	
	public StringAndValueEntry(String key, V value) {
		super(key, value);
	}

}
