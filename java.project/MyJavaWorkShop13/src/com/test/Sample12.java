package com.test;

import java.util.Arrays;
import java.util.List;

class TestClass {
	public static void addNums(List<? super Integer> list) {
		for(Object o : list) {
			System.out.println(o);
		}
	}
	
}


public class Sample12 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30);
		System.out.println(list.getClass().getName());
		TestClass.addNums(list);
	}
}

