package ch07;

import java.util.Calendar;

public class Person {
//	① 이름을 저장하는 변수, 주민등록번호를 저장하는 변수를 정의해봅시다.

	String name;
	String perNum;
	int age;
	
//	④ Person 클래스에 생성자를 정의해서 인스턴스 변수들을 초기화 해봅시다.
	
	Person(String name, String perNum){
		this.name = name;
		this.perNum = perNum;
	}
	int ageCal() { 			// 주민등록번호 앞 두자리로 나이 계산
		String birthYear = perNum.substring(0,2); // 태어난 연도 = 주민등록번호 앞자리 2개 추출
		int check = Integer.parseInt(perNum.substring(8,9)); // 2000년도 이전, 이후를 구분하기 위해 7번째 자리 확인
		if(check == 1 || check == 2) {
			age = Calendar.getInstance().get(Calendar.YEAR) - (1900 + Integer.parseInt(birthYear)) + 1;
		} else if (check == 3 || check == 4){
			age = Calendar.getInstance().get(Calendar.YEAR) - (2000 + Integer.parseInt(birthYear)) + 1;
		} 
		return  age;
	}
//	② 인사하는 메소드를 정의해봅시다.
//	- “안녕하세요. 저는 OOO입니다. 00살 입니다.”라는 문자열이 출력하도록 정의합시다.
	
	void hello() {			
		System.out.printf("안녕하세요. 저는 %s 입니다. %d 살 입니다. %n", name, ageCal());
	}
}
