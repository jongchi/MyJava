package com.test;

public class Sample14 {

//	static int add(int x, int y) {
//		return x + y;		
//	}
//
//	static int add2(int x, int y, int z) {
//		return x + y + z;
//	}
//	

	
	static int add(int a, int b) { return a+ b;}
	static int add(int a, int b, int c) { return a + b + c;}
	static String add(String a, String b) { return a + b;}
	// Overloading 오버로딩
	
	public static void main(String[] args) {
		int a = add(1,2);
		int b = add(1,2,3);
		String c = add("강","찬");
		System.out.println(a+b+c+"c");
	}

}
