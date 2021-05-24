package com.test;

class MyClass {
	int myVar1;
	static int myVar2;
}

public class Sample03 {
		static int myVar3;
	public static void main(String[] args) {
		MyClass m = new MyClass(); // 사용하려면 인스턴스를 하고 사용해야함 myVar1
		MyClass.myVar2 = 20; // static을 쓰면 인스턴스 안해도 바로 사용 가능 myVar2 // 속도는 빠르나 메모리를 점유하고 있음.
		System.out.println(MyClass.myVar2);
		// Sample03.myVar3 = 10; // Sample03 생략가능 안에 속해있기 때문에
		myVar3 = 20;
	}

}
