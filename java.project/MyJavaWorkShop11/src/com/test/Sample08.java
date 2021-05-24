package com.test;
public class Sample08 {
	public static void main(String[] args) {
		String msg1 = "이순신";
		String msg2 = "강감찬";
		String msg3 = msg1 + msg2;
		System.out.println(msg3);
		
		StringBuffer sb = new StringBuffer("이순신");
		System.out.println(sb.capacity());
		sb.append("강감찬");
		sb.insert(1, "세종대왕");
		sb.replace(1, 3, "안녕");
		sb.delete(1, 3);
		System.out.println(sb.toString());
		System.out.println(sb.capacity());
		
		
		
	}
}
