package com.test;

class Student1<T>{
	T s;
	Student1(T s){
		this.s = s;
	}
	public T gets() {
		return this.s;
	}
}

public class Sample03 {
	public static void main(String[] args) {
		Student1<String> stu = new Student1<String>("ÀÌ¼ø½Å");
		System.out.println(stu.gets());

	}

}
