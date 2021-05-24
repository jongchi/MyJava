package com.test3;

public class CastingTest1 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2= null;
		
		fe.water();
		car = fe;
		fe2 = (FireEngine)car; 
		fe2.water();

	}

}

class Car {
	String color;
	int door;
	
	void drive() { // 운전하는 기능
		System.out.println("Drive, Brrrr~");
	}
	
	void stop() { // 멈추는 기능
		System.out.println("Stop!!!");
	}
}

class FireEngine extends Car { // 소방차
	void water() { // 물 뿌리는 기능
		System.out.println("water!!!");
	}
}