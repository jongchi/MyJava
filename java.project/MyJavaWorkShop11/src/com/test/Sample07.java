package com.test;

public class Sample07 {

	public static void main(String[] args) {
		String msg = "안녕하세요.반가워요.";
		char c = msg.charAt(1);
		System.out.println(c);
		String msg1 = "abcdefgABCD";
		char c2 = msg1.charAt(7);
		System.out.println(c2);
		int n = (int)c2;
		System.out.println(n);
		String msg2 = "  반가워요  ";
		System.out.println(msg2.length());
		System.out.println(msg2.trim().length());
		System.out.println(msg2.trim());
		System.out.println(msg1.startsWith("ab"));
		int n2 = 1234;
		String temp2 = String.valueOf(n2);
		System.out.println(temp2 + 2);
		String msg3 = "ababc";
		String msg4 = msg3.replace("b", "c");
		System.out.println(msg4);
		String tel = "010-123-1234";
		System.out.println(tel.substring(0,3));
		System.out.println(tel.substring(4,7));
		System.out.println(tel.substring(3));
		char c3 = "방가워요".charAt(0);
	
	}

}




