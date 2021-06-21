package book;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;


public class BookManager {

	private BookDao dao;
	private Scanner sc;
	
	public BookManager(BookDao dao){
		this.dao = dao;
		sc = new Scanner(System.in);
	}

	// 전체 리스트 출력 메소드
	// DAO에서 데이터 리스트를 받고 출력 처리
	void bookList() {
		// Connection 객체 생성 -> 트랜젝션 처리
		Connection conn = null;


			String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String pw = "tiger";
		
		try {
			conn = DriverManager.getConnection(jdbcUrl, user, pw);
			
			List<Book> list = dao.getBookList(conn);
			
			System.out.println("도서 정보 리스트 ");
			System.out.println("--------------------------------------");
			System.out.println("도서번호 \t 도서이름 \t 출판사 \t 가격");
			System.out.println("--------------------------------------");
			
			for(Book book : list) {
				System.out.printf("%d \t %s \t %s \t %d \n", 
						book.getBookid(),
						book.getBookname(),
						book.getPublisher(),
						book.getPrice());	
			}
			
			System.out.println("---------------------------------------");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

	// 데이터 입력
	// 사용자에게 Scanner 클래스로 입력 받아 -> dao insertBook 메소드로 저장
	void inputData() {
		// Connection 객체 생성 -> 트랜젝션 처리
		Connection conn = null;

		// 2. 연결
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "tiger";
		
		try {
			conn = DriverManager.getConnection(jdbcUrl, user, pw);
		
			System.out.println("도서 정보를 입력합니다.");
			System.out.println("도서이름 출판사 가격 형식으로 입력해주세요.");
			System.out.println("예시) 총균쇠 비트출판사 13000 ");
			String inputData = sc.nextLine();
			String[] bookData = inputData.split(" ");
			
			Book book = new Book(0, bookData[0], bookData[1], Integer.parseInt(bookData[2]));
			
			int result = dao.insertBook(conn, book);
			
			if(result > 0 ) {
				System.out.println("입력 되었습니다.");
			} else {
				System.out.println("입력 실패!!!");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	// 데이터 수정
	// 사용자로부터 데이터를 받아 수정 -> dao editBook ()메소드 이용
	void editBook() {
		// Connection 객체 생성 -> 트랜젝션 처리
		Connection conn = null;

		// 2. 연결
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "tiger";
		
		try {
			conn = DriverManager.getConnection(jdbcUrl, user, pw);
			
			System.out.println("도서 정보를 수정합니다.");
			System.out.println("도서번호 도서이름 출판사 가격 형식으로 입력해주세요.");
			System.out.println("입력된 도서번호의 도서이름과 출판사, 가격이 수정됩니다.");
			String editData = sc.nextLine();
			String[] eData = editData.split(" ");
			
			Book book = new Book(
					Integer.parseInt(eData[0]), eData[1], eData[2], Integer.parseInt(eData[3]));
			
			dao.editBook(conn, book);
			
			int result = dao.editBook(conn, book);
			if(result>0) {
				System.out.println("수정되었습니다.");
			} else {
				System.out.println("수정 실패 !!");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	// 데이터 삭제
	// 사용자로부터 도서번호를 입력받아 도서정보를 삭제
	void delBook() {
		// Connection 객체 생성 -> 트랜젝션 처리
		Connection conn = null;

		// 2. 연결
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "tiger";
		
		try {
			conn = DriverManager.getConnection(jdbcUrl, user, pw);
		
			bookList();
			System.out.println("삭제를 원하시는 도서번호를 입력해주세요.");
			int bookid = Integer.parseInt(sc.nextLine());
			
			int result = dao.deleteBook(conn, bookid);
			
			if(result>0) {
				System.out.println("삭제되었습니다.");
			} else {
				System.out.println("해당 부서의 정보가 없습니다.");
			}
		
		
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	} 
}
