package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;


public class ClassMemberDAO {

	// 외부 클래스 또는 인스턴스에서 해당 클래스로 인스턴스를 생성하지 못하도록 처리
	
	private ClassMemberDAO() {
		
	}
	// 2. 클래스 내부에서 인스턴스를 만들고 메소드를 통해서 반환하도록 처리
	static private ClassMemberDAO dao = new ClassMemberDAO();
	
	// 3. 메소드를 통해서 반환 하도록 처리
	public static ClassMemberDAO getInstance() {
		return dao;
	}
	
	// 1. 회원 가입 기능 

	int createId(Connection conn, ClassMember member){ // 회원 가입

		PreparedStatement pstmt = null;
		int result = 0;
		

			String sql = "insert into classmember (mno, mid, mpw, mname, mdate, mloc) values (classmember_mno_seq.nextval, ?, ?, ?, ?, ?)";
			try {
				pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, member.getMid());
			pstmt.setString(2, member.getMpw());
			pstmt.setString(3, member.getMname());
			pstmt.setString(4, member.getMdate());
			pstmt.setString(5, member.getMloc());
			
			
			result = pstmt.executeUpdate();
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if(pstmt != null) {
					try {
						pstmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		
		return result;
	}
	
	// 2. 회원 정보 수정

	int editInfo(Connection conn, ClassMember member) {

		int result = 0;

		PreparedStatement pstmt = null;
		
		try {
			String sql = "update classmember set mpw=?, mloc =?, mdate =? where mid=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, member.getMpw());
			pstmt.setString(2, member.getMloc());
			pstmt.setString(3, member.getMdate());
			pstmt.setString(4, member.getMid());

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