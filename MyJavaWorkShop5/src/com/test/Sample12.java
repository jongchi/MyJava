package com.test;

class Calculator1{
	
	// µ¡¼À, »¬¼À, °ö¼À, ³ª´°¼À ¸Þ¼Òµå¸¦ ±¸ÇöÇÏ½Ã¿À.
	// add, subtract, multiply, divide
	String name;
	int add(int a, int b) {
		return a + b;
	}
	int subtract(int a, int b) {
		return a - b;
	}
	int multiply(int a, int b) {
		return a * b;
	}
	int divide(int a, int b) {
		return a / b;
	}
	

}

public class Sample12 {
	public static void main(String[] args) {
		Calculator1 calc = new Calculator1();
		int a = calc.add(10, 10);
		int b = calc.divide(10,2);
		int c = calc.multiply(4, 5);
		int d = calc.subtract(15, 2);
		System.out.printf("%d, %d,%d,%d,",a,b,c,d);
	}

}
