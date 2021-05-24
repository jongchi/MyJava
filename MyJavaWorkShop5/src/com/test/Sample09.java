package com.test;

public class Sample09 {
	static int add(int x, int y) {
		return x + y ;
	}
	static void test(String msg) {
		if(msg == "OK") {
			return; // void 매서드에서 리턴 값은 원래 자리로 되 돌아가는것.
		}
	}
	public static void main(String[] args) {
		int d = add(10,20);
		System.out.println(d);
		test("Error");
		test("OK");
		
	}

}
