package com.test;
class Person {
	long id;
	Person(long id){
		this.id = id;
	}
	public boolean equals(Object obj) {
		if((obj != null) && obj instanceof Person) {
			Person p = (Person)obj;
			return this.id == p.id;
		} else {
			return false;
		}
	}	
}
public class Sample03 {
	public static void main(String[] args) {
		Person p = new Person(10);
		Person p2 = new Person(20);
		boolean check = p.equals(p2);
		System.out.println(check);
		

	}

}
