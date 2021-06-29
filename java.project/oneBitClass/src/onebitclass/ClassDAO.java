package onebitclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import member.ClassMember;

public class ClassDAO {

	// 외부 클래스 또는 인스턴스에서 해당 클래스로 인스턴스를 생성하지 못하도록 처리

	// 2. 클래스 내부에서 인스턴스를 만들고 메소드를 통해서 반환하도록 처리
	static private ClassDAO dao = new ClassDAO();

	// 3. 메소드를 통해서 반환 하도록 처리
	public static ClassDAO getInstance() {
		return dao;
	}

	// 1. 강좌 개설 기능

	int createClass(Connection conn, BitClass bitClass, int mno) { // 강좌 개설, 강사 번호 입력.

		System.out.println(1111);
		PreparedStatement pstmt = null;
		int result = 0;

		String sql = "insert into bitclass (cno, mno, title, cloc, startdate, enddate, fee, numpeople) values (bitclass_cno_seq.nextval, ?, ?, ?, ?, ?, ?, ?)";

		System.out.println(sql);

		try {
			pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, mno);
			pstmt.setString(2, bitClass.getTitle());
			pstmt.setString(3, bitClass.getCloc());
			pstmt.setString(4, bitClass.getStartdate());
			pstmt.setString(5, bitClass.getEnddate());
			pstmt.setInt(6, bitClass.getFee());
			pstmt.setInt(7, bitClass.getNumpeople());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return result;
	}

	// 2. 강좌 할인 적용

	int editInfo(Connection conn, BitClass bitClass) {

		int result = 0;

		PreparedStatement pstmt = null;

		try {
			String sql = "update bitclass set discount = ? where cno=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bitClass.getDiscount());
			pstmt.setInt(2, bitClass.getCno());

			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return result;
	}

	// 3. 내가 개설한 강좌 정보 가져오기
	ArrayList<BitClass> getInfo(Connection conn, int mno) {

		ArrayList<BitClass> list = null;

		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			String sql = "select * from bitclass where mno = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, mno);

			// 결과 받아오기
			rs = pstmt.executeQuery();

			list = new ArrayList<>();

			while (rs.next()) {
				list.add(new BitClass(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getFloat(9), rs.getInt(10), rs.getInt(11)));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

		return list;
	}
	
	// 3. 전체 강좌 정보 가져오기
		ArrayList<BitClass> getTakeClass(Connection conn) {

			ArrayList<BitClass> list = null;

			PreparedStatement pstmt = null;
			ResultSet rs = null;

			try {
				String sql = "select * from bitclass order by cno";
				pstmt = conn.prepareStatement(sql);

				// 결과 받아오기
				rs = pstmt.executeQuery();

				list = new ArrayList<>();

				while (rs.next()) {
					list.add(new BitClass(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),
							rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getFloat(9), rs.getInt(10), rs.getInt(11)));
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			} finally {
				if (rs != null) {
					try {
						rs.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

				if (pstmt != null) {
					try {
						pstmt.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}

			return list;
		}
}