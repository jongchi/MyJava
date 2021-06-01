package ch09;


public class Person {
	String name;
	String personNumber;
	
	public Person(String name, String personNumber) {
		this.name = name;
		this.personNumber = personNumber;
	}
	
	public boolean equals(Object obj) {
		boolean chk = false;
		if(obj != null && obj instanceof Person) {
			Person person = (Person)obj;
			if(this.personNumber.equals(person.personNumber)) {
				chk = true;
			}	
		} return chk;
	}
	
	public static void main(String[] args) {
		Person per1 = new Person("홍길동","123456-1234567");
		Person per2 = new Person("김갑생","123456-1234567");
		
		System.out.println(per1.equals(per2));

	}
}
