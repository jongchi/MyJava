package com.test;
public class Sample01 {
	static void method1() throws Exception {
		int b = 10/0;		
	}
	static void method2() throws Exception {
		method1();
	}
	public static void main(String[] args) {
		try {
			method2();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
//		try {
////			int a = 10/0;
//			throw new ArithmeticException();
//		} catch(ArithmeticException ex) {
//			System.out.println(ex.getMessage());
//		} catch(Exception ex) {
//			System.out.println("그외의 예외");
//		} finally {
//			System.out.println("End");
//		}
	}
}
