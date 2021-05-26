package ch07;

public class PersonMain {

	public static void main(String[] args) {
//		① Person 클래스를 상속받은 Male클래스와 Female클래스를 이용해서 인스턴스를 생성해 봅시다.

		Person per1 = new Person("홍길동","910101-1234567");
		Person man1 = new Male("이순신","810101-1234567","해군");
		Person woman1 = new Female("신사임당","710101-2345678","성균관대학교");
		
//		② 생성된 인스턴스들을 이용해서 메소드를 호출해봅시다.
		per1.hello();
		man1.hello();
		woman1.hello();

	}

}
