package projectEx;

import java.util.Scanner;

public class InfoManager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		PhoneNumInfo person1;
		System.out.println("등록할 이름을 입력해주세요.");
		String name = scanner.nextLine();
		System.out.println("전화번호를 입력해주세요.");
		String phoneNum = scanner.nextLine();
		System.out.println("이메일을 입력해주세요.");
		String email = scanner.nextLine();
		System.out.println("주소를 입력해주세요.");
		String address = scanner.nextLine();
		System.out.println("생일을 입력해주세요.");
		String birthDay = scanner.nextLine();
		System.out.println("그룹을 입력해주세요.");
		String group = scanner.nextLine();
		person1 = new PhoneNumInfo(name, phoneNum, email, address, birthDay, group);
		System.out.println("정상적으로 등록되었습니다.");
		
		person1.ShowInfo();
		
		person1.setAddress("전주");
		
		person1.ShowInfo();
		
	}
	
}
