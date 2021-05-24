package com.test3;

class Animal {
	void breathing() { System.out.println("Animal breathing");}
}
class Dog extends Animal {
	void barking() { System.out.println("Dog barking"); } 
}
class BlackDog extends Dog {
	void running() { System.out.println("BlackDog running");}
}
class Cat extends Animal {
	void meowing() { System.out.println("Cat meowing"); } 
}
public class Sample07 {
	static void test(Animal n) {
		Animal a2 = null;
		String name = n.getClass().getName();
		switch(name){
			case "Dog":
				n = new Dog(); 
				break;
			case "BlackDog":
				break;
		}
	}
	public static void main(String[] args) {
		BlackDog black = new BlackDog();
		Dog dog = black;
		Animal animal3 = dog;
		BlackDog black2 = (BlackDog)animal3;
		black.running();
		Dog dog6 = (Dog)animal3;
		dog6.barking();
		dog6.breathing();
		
		BlackDog bkdog = new BlackDog();
		Animal obj2 = bkdog;				// 아래 코드와 같은 형태
		
		Animal obj = new BlackDog();		// 위와 같은 형태임 코드를 줄일 수 있음.
		Animal obj3 = new Dog();

		
//		Dog dog = new Dog();
//		Animal animal = (Animal)dog;
//		Dog dog2 = (Dog)animal;
//		
//		Dog dog3 = new Dog();
//		Animal animal2 = dog3;
//		Cat cat = (Cat)animal2; // 형제관계(x)
//
//		Animal animal3 = new Animal();
//		Dog dog4 = (Dog)animal3; // 객체가 존재하지 않는 경우 하위 (X)
		
	}
}
