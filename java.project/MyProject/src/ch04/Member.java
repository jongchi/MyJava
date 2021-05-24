package ch04;
import java.util.*;

public class Member {
	static final int YEAR = 2021; // 2021년도 나이 계산
	
	static int ageCheck(int yearOfBirth) {	// 올해 나이 계산
		int age = YEAR - yearOfBirth;
		System.out.println("당신은 " + age + "살 입니다.");
		return age;
	}

	static void fluShot(int age) { 	// 독감 예방 접종 여부
		boolean ageCheck = age < 15 || age >= 65;
		if (ageCheck) {
			System.out.println("무료예방접종이 가능합니다.");
		} else {
			System.out.println("무료 접종 대상이 아닙니다.");
		}
	}
	
	static void healthCheck(int age) { // 건강검진 대상 여부 
		if (age >= 20) {				// 20세 이상의 성인일 경우
			if(age%2 == 0) {			// 짝수해에는 짝수년도생 검사 대상
				System.out.println("무료 건강검진 대상자입니다."); 
				if (age >= 40) {		// 건강 검진 대상자 중 40 세 이상.
					System.out.println("암 검사도 무료로 받을 수 있습니다.");
				}
			} else {
				System.out.println("무료 건강검진 대상자가 아닙니다.");
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
			System.out.println("태어난 년도를 입력해주세요 ex)1991");
			int yearOfBirth = scanner.nextInt();	
			int age = ageCheck(yearOfBirth);
			fluShot(age); 
			
			healthCheck(age);

	}
}
