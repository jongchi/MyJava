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
	
	void drive() { // �����ϴ� ���
		System.out.println("Drive, Brrrr~");
	}
	
	void stop() { // ���ߴ� ���
		System.out.println("Stop!!!");
	}
}

class FireEngine extends Car { // �ҹ���
	void water() { // �� �Ѹ��� ���
		System.out.println("water!!!");
	}
}