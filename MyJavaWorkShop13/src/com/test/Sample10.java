package com.test;

import java.util.*;

class A {}

class B extends A {}

public class Sample10 {
	static void test(Object o) { }
	static void test1(A a) { } 
	static void test2(B b) { }
	static <T> void test3(T o) { }
	static void test4(ArrayList<?> al) { }
	public static void main(String[] args) {	
	}
}