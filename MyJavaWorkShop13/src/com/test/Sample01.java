package com.test;
interface IStudent {
	public void gotoSchool();
	
}

class Student implements IStudent {

	@Override
	public void gotoSchool() {
		System.out.println("Student gotoSchool");		
	}
	
}

public class Sample01 {
	static void CreateStudent(IStudent stu) {
		stu.gotoSchool();
	}
	public static void main(String[] args) {
//		IStudent stu = new Student();
//		stu.gotoSchool();
		CreateStudent(new Student());
	}

}
