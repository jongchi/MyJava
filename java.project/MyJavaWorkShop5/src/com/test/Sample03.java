package com.test;

class MyClass {
	int myVar1;
	static int myVar2;
}

public class Sample03 {
		static int myVar3;
	public static void main(String[] args) {
		MyClass m = new MyClass(); // ����Ϸ��� �ν��Ͻ��� �ϰ� ����ؾ��� myVar1
		MyClass.myVar2 = 20; // static�� ���� �ν��Ͻ� ���ص� �ٷ� ��� ���� myVar2 // �ӵ��� ������ �޸𸮸� �����ϰ� ����.
		System.out.println(MyClass.myVar2);
		// Sample03.myVar3 = 10; // Sample03 �������� �ȿ� �����ֱ� ������
		myVar3 = 20;
	}

}
