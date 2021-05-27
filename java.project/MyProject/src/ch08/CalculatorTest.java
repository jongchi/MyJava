package ch08;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator2();
		System.out.println(calc.add(1, 2));
		System.out.println(calc.substract(10, 3));
		System.out.println(calc.multiply(10, 32));
		System.out.println(calc.divide(40, 7));
	}
}
