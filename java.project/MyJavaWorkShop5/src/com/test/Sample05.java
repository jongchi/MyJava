package com.test;

class Dog2 {
	String name;
	String color;
	void barking() {
		System.out.println("이름이 "
				+ name + "이고 색깔이 "
				+ color + "인 개가 짖는다.");
	}
}
public class Sample05 {
	public static void main(String[] args) {
		Dog2 dog = new Dog2();
		Dog2 dog2 = new Dog2();
		Dog2 dog3 = new Dog2();
		
		Dog2[] dogs = new Dog2[3];
		dogs[0] = new Dog2();
		dogs[1] = new Dog2();
		dogs[2] = new Dog2();
		
		System.out.println(dogs[0].name);
		
		Dog2[] dogs2 = {
				new Dog2(),
				new Dog2(),
				new Dog2()
		};
	} // main 종료 지점
} 
