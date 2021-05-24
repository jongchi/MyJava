package com.test;

public class Sample13 {
	enum Menu {
		pizza,
		pasta,
		ramyeon,
	}
	public static void main(String[] args) {
		System.out.print(Menu.pizza);
		
		for(Menu m : Menu.values())	{
			System.out.println(m);
			System.out.println(m.ordinal());
			}
	}

}
