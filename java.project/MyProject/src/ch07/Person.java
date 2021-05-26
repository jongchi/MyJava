package ch07;

import java.util.Calendar;

public class Person {
//	① 이름을 저장하는 변수, 주민등록번호를 저장하는 변수를 정의해봅시다.

	String name = "홍길동";
	String perNum = "910101-1234567";
	
//	④ Person 클래스에 생성자를 정의해서 인스턴스 변수들을 초기화 해봅시다.
	
	Person(String name, String perNum){
		this.name = name;
		this.perNum = perNum;
	}
	int ageCal() { 			// 주민등록번호 앞 두자리로 나이 계산
		String birthYear = "";	// 태어난 연도 초기화
		birthYear = perNum.substring(0,2); // 주민등록번호 앞자리 2개 추출
		return Calendar.getInstance().get(Calendar.YEAR) - (1900 + Integer.parseInt(birthYear)) + 1 ;
	}
//	② 인사하는 메소드를 정의해봅시다.
//	- “안녕하세요. 저는 OOO입니다. 00살 입니다.”라는 문자열이 출력하도록 정의합시다.
	
	void hello() {			
		System.out.printf("안녕하세요. 저는 %s 입니다. %d 살 입니다. %n", this.name, ageCal());
	}
}
