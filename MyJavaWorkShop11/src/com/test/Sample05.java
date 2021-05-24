package com.test;
class Student {
	String name;
	int age;
	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		String str = this.name + ", " + this.age;
		return str;
	}	
}
public class Sample05 {
	public static void main(String[] args) {
		Student stu = new Student("ÀÌ¼ø½Å", 30);
		System.out.println(stu);

	}

}
