package com.test;
class MyClass2 {
	int a;
	static int b;
}

public class Sample06 {
	int a = 0;
	static int b = 10;
	public static void main(String[] args) {
		Sample06 s = new Sample06();
		s.a = 10;
		System.out.println(s.a);
		b = 20;
		System.out.println(b);
		
		MyClass2 m = new MyClass2();
		m.a = 30;
		MyClass2.b = 200;
	}

}
