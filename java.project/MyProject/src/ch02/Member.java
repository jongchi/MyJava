package ch02;

public class Member {
// ch02.Member 실제 이름은 패키지 이름을 포함.
// Member 클래스에 main() 메소드 안에 아래 조건의 변수를 정의해봅시다.
//①String 타입의 이름을 저장할 수 있는 변수 name을 정의해봅시다.
//②int 타입의 나이를 저장할 수 있는 변수 age를 정의해봅시다.
//③double 타입의 키를 저장할 수 있는 변수 height를 정의해봅시다.
//④boolean 타입의 JAVA책의 보유 여부를 저장할 수 있는 변수 hasBook를 정의해봅시다.
//⑤이름과 나이, 키, 책의 보유 여부를 출력해봅시다.

	public static void main(String[] args) {
		// 변수 선언
		// 데이터의 타입 식별 이름
		// 데이터 타입 -> 내가 다루어야 하는 데이터의 특징에 의해서 결정
		// 기본형 타입 8가지 -> 정수형, 실수형, bool, 문자
		
		System.out.println("성종원");
		
		String name = "성종원";				// 이름 초기화
		int age = 31;						// 나이 초기화
		double height = 178.1d;				// 키 초기화	
		boolean hasBook = true;				// 책 보유 여부 초기화
		System.out.println("이름 : " +  name );
		System.out.println("나이 : "+ age + "살");
		System.out.println("키 : "+ height + "cm");
//		System.out.println("JAVA 책 보유 : "+ hasBook);
		if(hasBook) {					
			System.out.println("책을 보유하고 있습니다.");
		} else {
			System.out.println("책을 보유하고 있지 않습니다.");
		}
		System.out.println();				// 정보 출력
		
		// String + any Type -> String + String
										
		Person per1 = new Person("홍길동","010-1234-5678",
								"910721-1234567");	// 생성자 통한 per1 생성
		System.out.println(per1);
		per1.perName = "성종원";	
		per1.perPhoneNo = "010-2345-6789";
		per1.perNo1 = "910721-1357913";
		
		System.out.println(per1);
		

	}
}
