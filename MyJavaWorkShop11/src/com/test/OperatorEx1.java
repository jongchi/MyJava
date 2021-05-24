package com.test;

public class OperatorEx1 {

	public static void main(String[] args) {
		int i =5, j=0;
		
		j = i++;
		System.out.println("j=i++실행 후, i ="+i+ " j = "+j);
		System.out.println(i+","+j+","+j);
		i = 5;
		j = 0;
		
		j = ++i;
		System.out.println("j=++i실행 후, i ="+i+" j = "+j);
		int x = 5;
		int y = x++ - ++x;
		System.out.println(y);
	}

}
