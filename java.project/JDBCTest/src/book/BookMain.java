package book;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		
		BookManager manager = new BookManager(BookDao.getInstance());
		Scanner sc = new Scanner(System.in);
		int num = 0;
		
		try {
			// 1. 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			while(num != 5) {
				System.out.println("도서 관리 프로그램");
				System.out.println("--------------------------------");
				System.out.println("1. 도서 리스트");
				System.out.println("2. 도서 정보 입력");
				System.out.println("3. 도서 정보 수정");
				System.out.println("4. 도서 정보 삭세");
				System.out.println("5. 프로그램 종료");
				System.out.println("--------------------------------");
				System.out.println("원하시는 기능의 번호를 입력해주세요.");
				num = Integer.parseInt(sc.nextLine());
				
				switch(num) {
				case 1 :
					manager.bookList();
					break;
				case 2 :
					manager.inputData();
					break;
				case 3 :
					manager.editBook();
					break;
				case 4 :
					manager.delBook();
					break;
				case 5 :
					System.out.println("프로그램을 종료합니다.");
					break;
				}
			}
						
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}

