
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
	}
}
