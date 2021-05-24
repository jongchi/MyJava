package com.test;
import java.util.*;

class Calculator2{
	
	// 덧셈, 뺄셈, 곱셈, 나눗셈 메소드를 구현하시오.
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
		// 1. 덧셈
		// 2. 뺄셈
		// 3. 곱셈
		// 4. 나눗셈
		// 5. 종료
		// ###################################
		// # 메뉴를 선택해주세요. :
		// 
		// 1을 선택한경우
		// 첫번째 숫자를 입력해주세요. :
		// 두번째 숫자를 입력해주세요. :
		// 결과는 10입니다.
		// 단,종료를 누를 때까지 계속 반복적으로 처리하도록 구현하시오.
		// 사칙연산은 메소드로 구현하시오.
		Scanner scanner = new Scanner(System.in);
		Calculator2 calc = new Calculator2();
		while(true) {
		System.out.println("###################################");
		System.out.println("1. 덧셈");
		System.out.println("2. 뺄셈");
		System.out.println("3. 곱셉");
		System.out.println("4. 나눗셈");
		System.out.println("5. 종료");
		System.out.println("###################################");
		System.out.println("# 메뉴를 선택해주세요. : ");
		int menuSelect = scanner.nextInt();
			
			if(menuSelect == 1 ) {
				System.out.println("첫 번째 숫자를 입력해주세요.");
				int a = scanner.nextInt();
				System.out.println("두 번째 숫자를 입력해주세요.");
				int b = scanner.nextInt();
				int result = calc.add(a, b);
				System.out.println("결과는 " + result + "입니다.");
				System.out.println();
			}
			if(menuSelect == 2 ) {
				System.out.println("첫 번째 숫자를 입력해주세요.");
				int a = scanner.nextInt();
				System.out.println("두 번째 숫자를 입력해주세요.");
				int b = scanner.nextInt();
				int result = calc.subtract(a, b);
				System.out.println("결과는 "+result+"입니다.");
				System.out.println();
			}
			if(menuSelect == 3 ) {
				System.out.println("첫 번째 숫자를 입력해주세요.");
				int a = scanner.nextInt();
				System.out.println("두 번째 숫자를 입력해주세요.");
				int b = scanner.nextInt();
				int result = calc.multiply(a, b);
				System.out.println("결과는 "+result+"입니다.");
				System.out.println();
			}
			if(menuSelect == 4 ) {
				System.out.println("첫 번째 숫자를 입력해주세요.");
				int a = scanner.nextInt();
				System.out.println("두 번째 숫자를 입력해주세요.");
				int b = scanner.nextInt();
				int result = calc.divide(a, b);
				System.out.println("결과는 "+result+"입니다.");
				System.out.println();
			}
			
			if(menuSelect == 5 ) {
				break;
			}
	} // while의 끝
	}// 메인의 끝
}

