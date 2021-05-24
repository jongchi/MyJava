package ch02;

public class Person {
	String perName;			// 이름
	String perPhoneNo;		// 전화번호
	String perNo; 			// 주민등록번호
	Person(String perName, String perPhoneNo, String perNo){
		this.perName = perName;
		this.perPhoneNo = perPhoneNo;
		this.perNo = perNo;
	}
	
	public String toString() {
		return "이름 : " + perName +" 전화번호 : "+ perPhoneNo +" 주민등록번호 : "+ perNo;
	}
	
}
