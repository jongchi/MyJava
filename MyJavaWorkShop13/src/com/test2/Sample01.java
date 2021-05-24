package com.test2;

interface ICalculator	{
	public int add(int a, int b);
}
interface TestFunc {
	public void msg();
}
public class Sample01 {
	public static void main(String[] args) {
		TestFunc t = ()->{
		System.out.println();
	};
		ICalculator d = 
				new ICalculator() {
			public int add(int x, int y) {
				return x + y;
			}
		};
		int c = d.add(10, 20);
		System.out.println(c);
		
		ICalculator d2 = (a, b) -> { 
			return a+b;
		};
		int c2 = d2.add(30, 40);
		System.out.println(c2);
	}

}