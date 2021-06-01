package ch10;

import java.util.*;

public class ExceptionTest {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("사용자 ID를 입력해주세요.");
		String input = scanner.nextLine();
		if(input != null && !input.trim().isEmpty()) {
			try {
				 
				if(checkId(input)) {
					System.out.println("입력하신 ID : "+ input);
				} else { 
					throw new BadIdInputException("영문자와 숫자로만 입력해주세요."); 
				}
			}
			catch(BadIdInputException e) {
				 System.out.println(e.getMessage());
			} 
			
			
		}
		 System.out.println("프로그램을 정상적으로 종료합니다.");
	}

	static boolean checkId(String input) {
		char[] chk = input.toCharArray();
		for(int i=0;i<chk.length;i++) {
			if((chk[i] >= '0' && chk[i] <= '9') ||
					(chk[i] >= 'a' && chk[i] <= 'z') ||
					(chk[i] >= 'A' && chk[i] <= 'Z')) {
				return true;
			} else {
				return false;
			}
		}
		return false; 
	}
}
