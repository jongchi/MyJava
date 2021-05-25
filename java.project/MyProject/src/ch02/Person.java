package ch02;

// ①회원이름을 저장하는 변수
// ②회원 전화번호 ( 000-0000-0000 )를 저장하는 변수
// ③회원 주민등록번호 ( 000000-0000000 또는 0000000000000 )를 저장하는 변수

public class Person {
	String perName;			// 이름
	String perPhoneNo = "000-0000-0000";		// 전화번호
	String perNo1 = "900000-0000000"; // 주민등록번호 : 문자형
	long perNo2	= 9000000000000l;
	
	Person(){}	
	
	Person(String perName, String perPhoneNo, String perNo){
		this.perName = perName;
		this.perPhoneNo = perPhoneNo;
		this.perNo1 = perNo;
	}
	
	public String toString() {
		return "이름 : " + perName +" 전화번호 : "+ perPhoneNo +" 주민등록번호 : "+ perNo1;
	}
	
	void showData() {
		System.out.println("회원 이름 : " + perName);
		System.out.println("전화 번호 : " + perPhoneNo);
		System.out.println("주민등록번호1 : " + perNo1);
		System.out.println("주민등록번호2 : " + perNo2);
	}
	public static void main(String[] args) {
		// Person 인스턴스 생성
		Person person = new Person();
		
		System.out.println("이름 : "+person.perName);
		person.perName = "손흥민";
		person.showData();
	}
}
