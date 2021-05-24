package ch03;

import java.util.Scanner;

public class Calculator {

		void add(int a, int b) { // 더하기 연산 후 출력하는 메소드
			int result = a + b;
			System.out.println(result);
		}
		void sub(int a, int b) { // 빼기 연산 후 출력하는 메소드
			int result = a - b;
			System.out.println(result);
		}		
		void multi(int a, int b) { // 곱하기 연산 후 출력하는 메소드
			int result = a * b;
			System.out.println(result);
		}	
		void div(int a, int b) { // 나누기 연산 후 출력하는 메소드
			int result = a - b;
			System.out.println(result);
		}	
		final double PI = 3.14159d; // 원의 둘레와 넓이를 구하기 위한 원주율 
		
		double circlePerimeter(double r) { // 원 둘레 계산
			double perimeter = 2*PI*r; 	// 원 둘레
			return perimeter; 
		}
		double circleArea(double r) { // 원 넓이
			double area = PI*r*r; 
			return area;
		}
	public static void main(String[] args) {
			Calculator cal = new Calculator();
			
			cal.add(2, 5);		// 사칙 연산 
			cal.sub(10, 2);
			cal.multi(10, 5);
			cal.div(10, 2);
			
			double a1 = cal.circlePerimeter(6); // 원 계산
			System.out.println(a1);
			double a2 = cal.circlePerimeter(4);
			System.out.println(a2);
			
			System.out.println("첫 번째 숫자를 입력하세요."); // 숫자 입력
			int b1 = inputNum();
			System.out.println("두 번째 숫자를 입력하세요.");
			int b2 = inputNum();
			
		
			cal.add(b1, b2); // test
			
	}	
	static int inputNum() {
		Scanner scanner = new Scanner(System.in);  //매개변수 인자 전달
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		return num;
	}
}
