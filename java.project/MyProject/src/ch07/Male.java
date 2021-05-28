package ch07;

public class Male extends Person{

//  각 클래스는 상속 받은 멤버 외에 추가적인 변수와 메소드를 추가해서 새로운 클래스를 정의해봅시다.
	String army;
	
	Male(String name, String perNum, String army){
			super(name, perNum);
			this.army = army;
	}
// ③ Person 클래스에서 정의된 인사하는 메소드를 오버라이딩 해봅시다.
	
	void hello() {
		super.hello();
		if(this.army != null) {
			System.out.println("저는 "+ army +"에서 군복무를 했습니다.");	
		}
		
	}

}
