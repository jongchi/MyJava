package ch03;

import java.util.Scanner;

public class Calculator3 {

		int add(int a, int b) { // 더하기 연산 후 출력하는 메소드
			int result = a + b;
			System.out.println(a + " + " + b + " = " +result);
			return result;
		}
		int sub(int a, int b) { // 빼기 연산 후 출력하는 메소드
			int result = a - b;
			System.out.println(a + " - " + b + " = " +result);
			return result;
		}		
		int multi(int a, int b) { // 곱하기 연산 후 출력하는 메소드
			int result = a * b;
			System.out.println(a + " * " + b + " = " +result);
			return result;
		}	
		int div(int a, int b) { // 나누기 연산 후 출력하는 메소드
			int result = a / b;
			System.out.println(a + " / " + b + " = " +result);
			return result;
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
			Calculator3 cal = new Calculator3();
			
			System.out.println("첫 번째 숫자를 입력하세요."); // 숫자 입력
			int b1 = inputNum();	// 첫 번째 숫자 입력
			System.out.println("두 번째 숫자를 입력하세요.");
			int b2 = inputNum();	// 두 번째 숫자 입력
			
			cal.add(b1, b2); // test
			cal.sub(b1, b2);
			cal.multi(b1, b2);
			cal.div(b1, b2);
			System.out.println();
			
			System.out.println("반지름을 입력해 주세요.");
			int a = inputNum();
			double a1 = cal.circlePerimeter(a); // 원 계산
			System.out.println("원의 둘레 : " + a1);
			double a2 = cal.circleArea(a);
			System.out.println("원의 넓이 : " + a2);
	}	
	static int inputNum() {
		Scanner scanner = new Scanner(System.in);  //매개변수 인자 전달
		String input = scanner.nextLine();
		int num = Integer.parseInt(input);
		return num;
	}
	
}
