package com.test;
import java.util.*;
interface Eatable{}
class Fruit implements Eatable{
	public String toString() {return "Fruit";}
}

class Apple extends Fruit { public String toString() {return "Apple";} }
class Grape extends Fruit { public String toString() {return "Grape";} }
class Toy 				  { public String toString() {return "Toy";} }

public class FruitBoxEx2 {
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
//		FruitBox<Apple> grapeBox1 = new FruitBox<Grape>(); 
//		FruitBox<Toy> toyBox = new FruitBox<Toy>();
		
		fruitBox.add(new Fruit());
		
		System.out.println("fruitBox-"+fruitBox);
		System.out.println("appleBox-"+appleBox);
		System.out.println("grapeBox-"+grapeBox);
	
	}

		
}
class FruitBox<T extends Fruit & Eatable> extends Box<T>{}

class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T get(int i)	{return list.get(i);}
	int size() 		{return list.size();}
	public String toString() { return list.toString();}
}