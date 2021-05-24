package com.test;

public class Sample05 {
	static <T> void printMsg(T[] names) {
		for(T s : names) {
			System.out.println(s);
		}
	}
	static <E> void PrintMsg2(E[] names) {
		for(E s : names) {
			System.out.println(s);
		}
	}
	static <E> void add(E a,E b) {
		E temp = a;
		E x = b;
		E y = temp;
		System.out.println(x+","+y);
	}
	
	public static void main(String[] args) {

		String[] names = {"È«±æµ¿","ÀÌ¼ø½Å","¼¼Á¾´ë¿Õ"};
		printMsg(names);
		Integer[] arr = {10,20,30,40,50};
		printMsg(arr);
		Integer a1 = 10;
		Integer b1 = 20;
		add(a1, b1);
	}

}
