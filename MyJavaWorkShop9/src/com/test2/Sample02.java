package com.test2;

interface IStudent{ // 메소드를 형태만 만들어놓고 실행내용을 정의하지 않음. 표준화 시키기에 용이함.
	public void study();
}
class Student implements IStudent{
	public void study() {
		System.out.println("학생이 공부하다.");
	}
}
public class Sample02 {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.study();
		IStudent stu2 = new Student();
		stu2.study();

	}

}
