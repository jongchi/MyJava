package ch05;

public class Member {
	String name;		// 이름	
	String phoneNo;		// 전화번호
	String major;		// 전공
	int grade;			// 학년
	String email;		// 이메일
	String birthDay;	// 생일
	String address;		// 주소

	public Member(String name, String phoneNo, String major, 
			int grade, String email, String birthDay, String address) {
		// 모든 정보 저장하는 생성자
		this(name, phoneNo, major, grade, email);
		this.birthDay = birthDay;
		this.address = address;
	}	
	
	public Member(String name, String phoneNo, String major, 
			 int grade ,String email) {
		// 생일, 주소 저장하지 않는 생성자.
		this.name = name;
		this.phoneNo = phoneNo;
		this.major = major;
		this.grade = grade;
		this.email = email;	
	}
	public void information() {
		System.out.println("이름 : "+ name);
		System.out.println("전화번호 : "+ phoneNo);
		System.out.println("전공 : "+ major);
		System.out.println("e-mail : "+ email);
		System.out.println("생일 : "+ birthDay);
		System.out.println("주소 : "+ address);
		System.out.println();
	}
	
	public static void main(String[] args) {
		Member mem1 = new Member("이순신","010-1234-5678","군사학과",4,"soonsin@naver.com",
									"07/21", "서울");
		mem1.information();
		
		Member mem2 = new Member("홍길동","010-2345-6789", "국어국문", 4,"gildong@naver.com");
		mem2.information();
	}

}
