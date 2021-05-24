package com.test;

class MyClass3{
	int a;
}

public class Sample13 {

	static void test(MyClass3 m2) { // MyClass3 m2 = m;
		System.out.println(m2.a);
		m2.a = 100;
	}
	// call by reference, pass by reference input/output 
	
	public static void main(String[] args) {
		MyClass3 m = new MyClass3();
		m.a = 10;
		test(m);
		System.out.println(m.a);
	}

}
