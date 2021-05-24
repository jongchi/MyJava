package com.test;

// 학생
// 이름, 나이, 학년, 성별
// 공부하다, 운동하다.
class Student {
	String name;
	int age;
	int grade;
	boolean gender;
	public void study() {
		System.out.println(name + "이 공부한다.");
	}
	public void execise() {}
}
// 사원
// 이름, 사번
// 일하다.
class Employee {
	String name;
	int empNo;
	public void work() {}
}

public class Sample01 {

	public static void main(String[] args) {
		Student tom = new Student();
		tom.name = "톰";
		tom.age = 30;
		tom.gender = true;
		tom.study();
		
		Student john = new Student();
		john.name = "존";
		john.age = 25;
		john.gender = true;
		john.study();
		
//		Employee susan = new Employee();
//		Employee kate = new Employee();
	}

}
