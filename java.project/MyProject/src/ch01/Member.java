package ch01;

public class Member {
	public static void main(String[] args) {
		System.out.println("성종원");
		
		Calculator calc = new Calculator();
		int a = calc.plus(5,5);
		System.out.println(a);
		int b = calc.subtract(10, 3);
		System.out.println(b);
		int c = calc.multiply(2, 5);
		System.out.println(c);
		int d = calc.divide(10, 2);
		System.out.println(d);
		
		String name = "성종원";
		int age = 31;
		double height = 178.1d;
		boolean hasBook = true;
		System.out.println("이름 : " +  name + " 나이 : "+ age + " 키 "+
							height + " JAVA 책 보유 : "+ hasBook);
		
		Person per1 = new Person("홍길동","010-1234-5678",
								"910721-1234567");
		System.out.println(per1);
		per1.perName = "성종원";
		per1.perPhoneNo = "010-2345-6789";
		per1.perNo = "910721-1357913";
		
		System.out.println(per1);

	}
}
