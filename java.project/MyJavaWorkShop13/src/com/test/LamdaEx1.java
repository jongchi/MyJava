package com.test;

interface MyFunction {
	void run();
}


public class LamdaEx1 {
	static void excute(MyFunction f) {
		f.run();
	}
	static MyFunction getMyFunction() {
		MyFunction f = () -> System.out.println("f1.run");
		return f;
	}
	
	public static void main(String[] args) {
		MyFunction f1 = ()->System.out.println("f1.run()");

		MyFunction f2 = new MyFunction() {
			public void run() {
				System.out.println("f2.run()");
			}
		};
		MyFunction f3 = getMyFunction();
		
		f1.run();
		f2.run();
		f3.run();
		
		excute(f1);
		excute( ()-> System.out.println("run()"));
	}

}
