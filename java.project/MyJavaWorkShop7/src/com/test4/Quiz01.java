package com.test4;

import java.util.Scanner;


public class Quiz01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		Calculator calc = new Calculator();
		while(true) {
		System.out.println("##### �޴� ######");
		System.out.println("1. ��Ģ����");
		System.out.println("2. ����");
		System.out.println("################");
		System.out.println("#�׸��� �������ּ���. : ");
		int input = scanner.nextInt();
		String menuSelect = "";
		if (input == 1 ) {
			System.out.println("�����ڸ� �����Ͻÿ�.(+,-,*,/) : ");

			menuSelect = scanner2.nextLine();
		
				if(menuSelect.equals("+")){
					System.out.println("ù ��° ���ڸ� �Է����ּ���.");
					int a = scanner.nextInt();
					System.out.println("�� ��° ���ڸ� �Է����ּ���.");
					int b = scanner.nextInt();
					int result = calc.add(a, b);
					System.out.printf("����� : %d + %d = %d %n", a,b,result);
					System.out.println();
				} else if(menuSelect.equals("-")) {
					System.out.println("ù ��° ���ڸ� �Է����ּ���.");
					int a = scanner.nextInt();
					System.out.println("�� ��° ���ڸ� �Է����ּ���.");
					int b = scanner.nextInt();
					int result = calc.subtract(a, b);
					System.out.printf("����� : %d - %d = %d %n", a,b,result);
					System.out.println();
				} else if(menuSelect.equals("*")) {
					System.out.println("ù ��° ���ڸ� �Է����ּ���.");
					int a = scanner.nextInt();
					System.out.println("�� ��° ���ڸ� �Է����ּ���.");
					int b = scanner.nextInt();
					int result = calc.multiply(a, b);
					System.out.printf("����� : %d * %d = %d %n", a,b,result);
					System.out.println();
				} else if(menuSelect.equals("/")) {
					System.out.println("ù ��° ���ڸ� �Է����ּ���.");
					int a = scanner.nextInt();
					System.out.println("�� ��° ���ڸ� �Է����ּ���.");
					int b = scanner.nextInt();
					int result = calc.divide(a, b);
					System.out.printf("����� : %d / %d = %d %n" , a,b,result);
					System.out.println();
				
				}
}
	else if (input == 2) { break;}
	}
}
}
class Calculator{

	String name;
	int add(int a, int b)    {  return a + b;   }
	int subtract(int a, int b) {return a - b;   }
	int multiply(int a, int b) { return a * b;	}
	int divide(int a, int b) {	return a / b;	}
	
}

