package com.test;
class Student extends Object{	// 자바의 모든 클래스는 오브젝트의 상속 값을 받게 된다.
	String name;
	void studying() {
		System.out.println(name + "가 공부하다.");
	}
}

class MiddleStudent extends Student{
	void eating() { System.out.println(name);}
}

class Point {
	int x;
	int y;
	
}
class Point3D extends Point{
	int z;
}
public class Sample03 {

	public static void main(String[] args) {
		MiddleStudent mstu	= new MiddleStudent();
		mstu.name = "이순신";
		mstu.studying();
		mstu.eating();
		Point3D p = new Point3D();
		p.x = 10;
		p.y = 20;
		p.z = 30;
	}

}
