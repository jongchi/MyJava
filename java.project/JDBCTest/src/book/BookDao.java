package book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BookDao {
	// 싱글톤 패턴 : 여러개의 인스턴스를 생성하지 못하도록 하는 디자인 패턴
	// 1. 외부 클래스 또는 인스턴스에서 해당 클래스로 인스턴스를 생성하지 못하도록 처리
	
	private BookDao() { // 기본 생성자 
		
	}
	
	// 2. 클래스 내부에서 인스턴스를 만들고 메소드를 통해서 반환하도록 처리
	static private BookDao dao = new BookDao();
	
	// 3. 메소드를 통해서 반환 하도록 처리
	public static BookDao getInstance() {
		return dao;
	}
	
	// 1. 전체 데이터 검색 기능
	// 반환 타입 List<Book>
	// 매개변수 - Connection 객체 : Statement
	ArrayList<Book> getBookList(Connection conn){

		ArrayList<Book> list = null;
		
		// 데이터 베이스의 Book테이블 이용 select 결과를 -> list 저장
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.createStatement();
			String sql = "select * from book order by bookid";
			
			// 결과 받아오기
			rs = stmt.executeQuery(sql);
			
			list = new ArrayList<>();
			
			// 데이터를 Book 객체로 생성 -> list에 저장
			while(rs.next()) {
				list.add(new Book(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} finally {
			if(rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
		
		
		return list;
	}

	
	// 2. Book 테이블에 데이터 저장하는 메소드
	// 반영 횟수 반환
	// 사용자로부터 데이터 받기 -> Book 객체
	int insertBook(Connection conn, Book book) {
		
		int result = 0;
		
		// 전달 받은 Book 객체의 데이터로 Book 테이블에 저장 -> 결과 값을 반환
		PreparedStatement pstmt = null;
		
		try {
			String sql = "insert into book values (book_bookid_seq.nextval, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book.getBookname());
			pstmt.setString(2, book.getPublisher());
			pstmt.setInt(3, book.getPrice());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
		return result;
	}

	
	// 3. Book 테이블의 데이터 수정 메소드
	// 반영된 행의 개수 반환
	// 사용자로부터 데이터를 받아서 처리 -> Book 객체
	int editBook(Connection conn, Book book) {

		int result = 0;
		
		// 전달 받은 Book 객체의 데이터로 Book 테이블에 저장 -> 결과 값을 반환
		PreparedStatement pstmt = null;
		
		try {
			String sql = "update book set bookname=?, publisher=?, price=? where bookid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, book.getBookname());
			pstmt.setString(2, book.getPublisher());
			pstmt.setInt(3, book.getPrice());
			pstmt.setInt(4, book.getBookid());
			
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		
		return result;
	}
	
	
	// 4. Book 테이블의 데이터를 삭제
	// 삭제된 행의 개수를 반환
	// 사용자로부터 bookid 받아서 처리
	
	int deleteBook(Connection conn, int bookid) {
		
		int result = 0;
		
		// 데이터 베이스 처리 sql
		PreparedStatement pstmt = null;
		
		
		try {
			String sql = "delete from book where bookid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bookid);
			
			result = pstmt.executeUpdate();
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
				
		
		return result;
	}
	
	
	
}