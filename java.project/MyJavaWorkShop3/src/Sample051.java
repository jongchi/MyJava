import java.util.Scanner;

public class Sample051 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.printf("문자를 입력해주세요. > ");
		char ch = ' ';
		
		String input = scanner.nextLine();
		ch = input.charAt(0);
		
		if('0' <= ch && ch <= '9') {
			System.out.println("입력하신 문자는 숫자입니다.");
		}
		if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			System.out.println("입력하신 문자는 영문자입니다.");
		}
	}

}
