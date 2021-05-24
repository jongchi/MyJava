package com.test4;

import java.util.Scanner;


public class Quiz01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		Calculator calc = new Calculator();
		while(true) {
		System.out.println("##### 메뉴 ######");
		System.out.println("1. 사칙연산");
		System.out.println("2. 종료");
		System.out.println("################");
		System.out.println("#항목을 선택해주세요. : ");
		int input = scanner.nextInt();
		String menuSelect = "";
		if (input == 1 ) {
			System.out.println("연산자를 선택하시오.(+,-,*,/) : ");

			menuSelect = scanner2.nextLine();
		
				if(menuSelect.equals("+")){
					System.out.println("첫 번째 숫자를 입력해주세요.");
					int a = scanner.nextInt();
					System.out.println("두 번째 숫자를 입력해주세요.");
					int b = scanner.nextInt();
					int result = calc.add(a, b);
					System.out.printf("결과는 : %d + %d = %d %n", a,b,result);
					System.out.println();
				} else if(menuSelect.equals("-")) {
					System.out.println("첫 번째 숫자를 입력해주세요.");
					int a = scanner.nextInt();
					System.out.println("두 번째 숫자를 입력해주세요.");
					int b = scanner.nextInt();
					int result = calc.subtract(a, b);
					System.out.printf("결과는 : %d - %d = %d %n", a,b,result);
					System.out.println();
				} else if(menuSelect.equals("*")) {
					System.out.println("첫 번째 숫자를 입력해주세요.");
					int a = scanner.nextInt();
					System.out.println("두 번째 숫자를 입력해주세요.");
					int b = scanner.nextInt();
					int result = calc.multiply(a, b);
					System.out.printf("결과는 : %d * %d = %d %n", a,b,result);
					System.out.println();
				} else if(menuSelect.equals("/")) {
					System.out.println("첫 번째 숫자를 입력해주세요.");
					int a = scanner.nextInt();
					System.out.println("두 번째 숫자를 입력해주세요.");
					int b = scanner.nextInt();
					int result = calc.divide(a, b);
					System.out.printf("결과는 : %d / %d = %d %n" , a,b,result);
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

