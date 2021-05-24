package com.test;

class Calculator {
	int add(int a, int b) { // int a = x, int b = y
		
//		int c = a + b;
//		return c;
		return a + b;
	}
	void test(String msg) {
		System.out.println(msg);
	}
}

public class Sample08 {

	public static void main(String[] args) {
		int x = 1;
		int y = 2;
		Calculator calc = new Calculator();
		int d = calc.add(x, y);
		System.out.println(d);
		calc.test("æ»≥Á«œººø‰.");
	}

}
