package ch01;

public class Calculator1 {
	// 강사님 해설
	// 메소드 -> 기능 (재료 -> 처리 -> 반환)
	// 반환타입 메소드이름(매개변수들){ 처리 구문 }
	void plus(int n1, int n2) {
		System.out.println(n1+n2);
	}

	void minus(int n1, int n2) {
		System.out.println(n1-n2);
	}
	
	void multi(int n1, int n2) {
		System.out.println(n1*n2);
	}
	
	void div(int n1, int n2) {
		System.out.println(n1/n2);
	}
	
	public static void main(String[] args) {
		
		// 인스턴스 생성 -> 클래스의 정의가 필요(필요한 변수, 필요한 메소드)
		// 클래스이름 참조변수 = new 클래스이름
		
		Calculator1 cal = new Calculator1();
		// 메모리에 메소드 코드를 저장해주는 것.
		// 참조변수 안에는 주소 값이 들어있음, 참조형의 주소 값 : 4byte 정수
		cal.plus(10, 20);
		cal.minus(20, 10);
		cal.div(10, 3);
		cal.multi(2, 5);
		
	}
}
