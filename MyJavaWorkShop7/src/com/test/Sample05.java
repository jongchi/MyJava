package com.test;
class A { // 부모
	void aMethod() { System.out.println("aMethod in A Class"); }
}

class B extends A { //자식
	void aMethod() { System.out.println("aMethod in B Class"); }
}
public class Sample05 {
	public static void main(String[] args) {
		B b = new B();
		b.aMethod();

	}

}
