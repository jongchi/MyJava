package com.test;

// �л�
// �̸�, ����, �г�, ����
// �����ϴ�, ��ϴ�.
class Student {
	String name;
	int age;
	int grade;
	boolean gender;
	public void study() {
		System.out.println(name + "�� �����Ѵ�.");
	}
	public void execise() {}
}
// ���
// �̸�, ���
// ���ϴ�.
class Employee {
	String name;
	int empNo;
	public void work() {}
}

public class Sample01 {

	public static void main(String[] args) {
		Student tom = new Student();
		tom.name = "��";
		tom.age = 30;
		tom.gender = true;
		tom.study();
		
		Student john = new Student();
		john.name = "��";
		john.age = 25;
		john.gender = true;
		john.study();
		
//		Employee susan = new Employee();
//		Employee kate = new Employee();
	}

}
