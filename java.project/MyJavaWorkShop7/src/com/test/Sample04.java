package com.test;

class Animal {
	void breathing() {
		System.out.println("Animal Breathing");
	}
}
class Dog extends Animal{
	void barking() {System.out.println("Dog barking");	}
}
class Cat extends Animal {
	void meowing() {System.out.println("Cat meowing");	}
}

public class Sample04 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.breathing();
		dog.barking();
		Cat cat = new Cat();
		cat.breathing();
		cat.meowing();
	}

}
