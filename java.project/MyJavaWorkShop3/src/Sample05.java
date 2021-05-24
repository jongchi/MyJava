import java.util.Scanner;

public class Sample05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.printf("문자를 하나 입력하세요.>");
		
		String input = scanner.nextLine();
		System.out.println(input.charAt(0));
		ch = input.charAt(0);
		// char 0 ~ 9 
		// 0 <= input.charAt(0) <= 9
		// 0 <= input.charAt(0) and
		// input.charAt(0) <= 9
		
		String msg = (('0' <= ch ) && ( ch <= '9'))? "Yes" : "No";
		System.out.println(msg);
	}

}
