package ch07;

public class Female extends Person{
	String university;
	
	Female(String name, String perNum, String university){
			super(name, perNum);
			this.university = university;
	}
	
	void hello() {
		System.out.printf("안녕하세요. 저는 %s 입니다. %d 살 입니다. %n", this.name, ageCal());
		if(this.university != null) {
			System.out.println("저는 "+ university +"를 졸업했습니다.");	
		}
		
	}
}
