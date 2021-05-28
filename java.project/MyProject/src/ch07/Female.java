package ch07;

public class Female extends Person{
	String university;
	
	Female(String name, String perNum, String university){
			super(name, perNum);
			this.university = university;
	}
	
	void hello() {
		super.hello();
		if(this.university != null) {
			System.out.println("저는 "+ university +"를 졸업했습니다.");	
		}
		
	}
}
