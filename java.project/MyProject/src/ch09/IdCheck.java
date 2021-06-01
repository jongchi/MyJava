package ch09;

import java.util.Scanner;

public class IdCheck {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름을 영어로 입력해주세요.");
		
		String id = scanner.nextLine();
		if(id!=null || !id.trim().isEmpty()) {
			if(checkId(id)) {
				System.out.println("입력하신 이름은 "+id+" 입니다.");
			} else {
				System.out.println("영어 외에 문자로 입력되었습니다.");
			}
		} else {
			System.out.println("공백이 입력되었습니다.");
		}

	}
	static boolean checkId(String input) {
		boolean result = true;
		char[] chk = input.toCharArray();
		for(int i=0;i<chk.length;i++) {
			if((chk[i] >= 'a' && chk[i] <= 'z') ||
					(chk[i] >= 'A' && chk[i] <= 'Z')) {
				result = true;
			} else {
				result = false;
			}
		}
		return result; 
	}
}
