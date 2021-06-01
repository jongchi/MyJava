package ch10;

import java.util.*;

public class BirthYear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("태어난 연도를 입력해주세요.");
		try {
			int input = scanner.nextInt();
			System.out.println("태어난 연도 : "+ input);
		} catch(InputMismatchException e){
			System.out.println("숫자만 입력해주세요.");
		}
		

	}
}
