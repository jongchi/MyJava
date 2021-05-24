package com.test;
class Employee {
	String name;
	int age;
	Employee(String name, int age){
		this.name = name;
		this.age = age;
	}
	public boolean equals(Object obj) {
		if((obj != null) && obj instanceof Employee) {
			Employee emp = (Employee)obj;			
				return (this.name == emp.name &&
						this.age == emp.age);
		} else {
			return false;
		}		
	}
}
public class Sample04 {
	public static void main(String[] args) {
		Employee emp = new Employee("이순신", 20);
		Employee emp2 = new Employee("이순신", 20);
		System.out.println(emp.equals(emp2));

	}

}
