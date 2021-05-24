package com.test;

class MyCustomException extends Exception {
	MyCustomException(String msg){
		super(msg);
	}
}
public class Sample02 {
	public static void main(String[] args) {
		int a = 10;
		if(a == 10) {
			try {
				throw new MyCustomException("a == 10¿Ã ∞∞¥Ÿ.");
			} catch(MyCustomException ex) {
				System.out.println(ex.getMessage());
			}
		}
	}
}


