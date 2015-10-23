package com.icarus.tutorial.generics.ci;

import com.google.gson.Gson;

public class TestGson {
	
	class result1 {
		private String a;
		private String b;
		public String getA() {
			return a;
		}
		public void setA(String a) {
			this.a = a;
		}
		public String getB() {
			return b;
		}
		public void setB(String b) {
			this.b = b;
		}
	}
	
	class result2 {
		private String c;
		private String d;
		public String getC() {
			return c;
		}
		public void setC(String c) {
			this.c = c;
		}
		public String getD() {
			return d;
		}
		public void setD(String d) {
			this.d = d;
		}
	}
	
	public static void main(String[] args) {

//		try {
//		Gson gson = new Gson();
//		String json = "[{\"a\":\"1\", \"b\":\"2\", \"c\":\"3\", \"d\":\"4\"},{\"a\":\"1\", \"b\":\"2\", \"c\":\"3\", \"d\":\"4\"}]";
//		result1[] r1 = gson.fromJson(json, result1.class);
//		} catch () {
//			
//		}
//		System.out.println(r1.length);
	}

}
