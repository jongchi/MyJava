package com.test;
class CustomWrapperType {
	private int i;
	CustomWrapperType(int i){
		this.i = i;
	}
	public int getValue() {
		return this.i;
	}
	public void setValue(int i) {
		this.i = i;
	}
	public String toString() {
		return Integer.toString(i);
	}
}
public class Sample10 {
	public static void main(String[] args) {
		CustomWrapperType c = 
				new CustomWrapperType(10);
		System.out.println(c);
		
		int a = 10;
		Object b = a;
		int c2 = (int)b;
		System.out.println(a);
		System.out.println(c2);
		

	}
}






