package ch05;

public class Member {
	String name;		// 이름	
	String phoneNo;		// 전화번호
	String major;		// 전공
	String email;		// 이메일
	String birthDay;	// 생일
	String address;		// 주소
	public Member(String name, String phoneNo, String major, 
			String email, String birthDay, String address) {
		// 모든 정보 저장하는 생성자
		this(name, phoneNo, major, email);
		this.birthDay = birthDay;
		this.address = address;
	}	
	
	public Member(String name, String phoneNo, String major, 
			String email) {
		// 생일, 주소 저장하지 않는 생성자.
		this.name = name;
		this.phoneNo = phoneNo;
		this.major = major;
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
		Member mem1 = new Member("성종원","010-1234-5678","관광경영","sesi8624@naver.com",
									"07/21", "서울시 도봉구");
		mem1.information();
		
		Member mem2 = new Member("홍길동","010-2345-6789", "국어국문", "gildong@naver.com");
		mem2.information();
	}

}
