package com.test;
import java.util.*;

class Calculator2{
	
	// ����, ����, ����, ������ �޼ҵ带 �����Ͻÿ�.
	// add, subtract, multiply, divide
	String name;
	int add(int a, int b)    {  return a + b;   }
	int subtract(int a, int b) {return a - b;   }
	int multiply(int a, int b) { return a * b;	}
	int divide(int a, int b) {	return a / b;	}
	

}


public class Quiz01 {
	public static void main(String[] args) {
		// ###################################
		// 1. ����
		// 2. ����
		// 3. ����
		// 4. ������
		// 5. ����
		// ###################################
		// # �޴��� �������ּ���. :
		// 
		// 1�� �����Ѱ��
		// ù��° ���ڸ� �Է����ּ���. :
		// �ι�° ���ڸ� �Է����ּ���. :
		// ����� 10�Դϴ�.
		// ��,���Ḧ ���� ������ ��� �ݺ������� ó���ϵ��� �����Ͻÿ�.
		// ��Ģ������ �޼ҵ�� �����Ͻÿ�.
		Scanner scanner = new Scanner(System.in);
		Calculator2 calc = new Calculator2();
		while(true) {
		System.out.println("###################################");
		System.out.println("1. ����");
		System.out.println("2. ����");
		System.out.println("3. ����");
		System.out.println("4. ������");
		System.out.println("5. ����");
		System.out.println("###################################");
		System.out.println("# �޴��� �������ּ���. : ");
		int menuSelect = scanner.nextInt();
			
			if(menuSelect == 1 ) {
				System.out.println("ù ��° ���ڸ� �Է����ּ���.");
				int a = scanner.nextInt();
				System.out.println("�� ��° ���ڸ� �Է����ּ���.");
				int b = scanner.nextInt();
				int result = calc.add(a, b);
				System.out.println("����� " + result + "�Դϴ�.");
				System.out.println();
			}
			if(menuSelect == 2 ) {
				System.out.println("ù ��° ���ڸ� �Է����ּ���.");
				int a = scanner.nextInt();
				System.out.println("�� ��° ���ڸ� �Է����ּ���.");
				int b = scanner.nextInt();
				int result = calc.subtract(a, b);
				System.out.println("����� "+result+"�Դϴ�.");
				System.out.println();
			}
			if(menuSelect == 3 ) {
				System.out.println("ù ��° ���ڸ� �Է����ּ���.");
				int a = scanner.nextInt();
				System.out.println("�� ��° ���ڸ� �Է����ּ���.");
				int b = scanner.nextInt();
				int result = calc.multiply(a, b);
				System.out.println("����� "+result+"�Դϴ�.");
				System.out.println();
			}
			if(menuSelect == 4 ) {
				System.out.println("ù ��° ���ڸ� �Է����ּ���.");
				int a = scanner.nextInt();
				System.out.println("�� ��° ���ڸ� �Է����ּ���.");
				int b = scanner.nextInt();
				int result = calc.divide(a, b);
				System.out.println("����� "+result+"�Դϴ�.");
				System.out.println();
			}
			
			if(menuSelect == 5 ) {
				break;
			}
	} // while�� ��
	}// ������ ��
}

