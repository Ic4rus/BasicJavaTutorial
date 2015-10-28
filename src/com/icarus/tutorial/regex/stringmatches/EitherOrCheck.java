package com.icarus.tutorial.regex.stringmatches;

public class EitherOrCheck {
	
	public static void main(String[] args) {
		
		String s = "The film Tom and Jerry";
		// Kiểm tra toàn bộ s
		// Bắt đầu bởi ký tự bất kỳ xuất hiện 0 hoặc nhiều lần
		// Tiếp theo là từ Tom hoặc Jerry
		// Kết thúc bởi ký tự bất kỳ xuất hiện 0 hoặc nhiều lần
		// Quy tắc: .*(Tom|Jerry).*
		// ==> true
		boolean match = s.matches(".*(Tom|Jerry).*");
		System.out.println("s=" + s);
		System.out.println("  -Match .*(Tom|Jerry).* " + match);
		
		s = "The cat";
		// false
		match = s.matches(".*(Tom|Jerry).*");
		System.out.println("s=" + s);
		System.out.println("  -Match .*(Tom|Jerry).* " + match);
		
		s = "The Tom cat";
		// true
		match = s.matches(".*(Tom|Jerry).*");
		System.out.println("s=" + s);
		System.out.println("  -Match .*(Tom|Jerry).* " + match);
		
	}

}