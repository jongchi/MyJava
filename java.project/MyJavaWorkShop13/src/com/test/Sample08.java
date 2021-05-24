package com.test;

import java.util.*;

public class Sample08 {
	
	static void test(ArrayList<?> al) {
		for(Object o : al) {
			System.out.println(o);
		}
	}
	public static void main(String[] args) {
//		ArrayList<?> al = new ArrayList<Integer>();
		test(new ArrayList<Integer>());
		test(new ArrayList<String>());
	}

}
