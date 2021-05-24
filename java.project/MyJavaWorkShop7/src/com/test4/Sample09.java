package com.test4;

class A {
	void aMethod() {
		System.out.println("aMethod in A");
	}
}

class B extends A {
	void aMethod() {
		System.out.println("aMethod in B");
	}
}

class C extends B {}

public class Sample09 {
	public static void main(String[] args) {
		B b = new B();
		b.aMethod();
		A b2 = new B();
		b2.aMethod(); // 
		A a = new C();
		a.aMethod();
	}

}
