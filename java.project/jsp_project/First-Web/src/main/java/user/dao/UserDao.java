package user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import jdbc.util.JdbcUtil;
import user.domain.User;

public class UserDao {
	private UserDao() {}
	
	static private UserDao dao = new UserDao();
	
	public static UserDao getInstance() {
		return dao==null? new UserDao() : dao;
	}
	
	public List<User> getUserList(Connection conn){
		List<User> list = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.createStatement();
			String sql = "select * from user";
			rs = stmt.executeQuery(sql); 			
			list = new ArrayList<User>();
			
			while(rs.next()) {
				list.add(new User(rs.getString(1),rs.getString(2),rs.getString(3),rs.getDate(4)));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.close(rs);
			JdbcUtil.close(stmt);
		}
		
		
		return list;
	}
	
	public int signUp(Connection conn, User user) {
		int resultCnt = 0;
		PreparedStatement pstmt = null;
		
		String sql = "insert into user (userId, pw, userName) values (?,?,?)";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user.getUserId());
			pstmt.setString(2, user.getPw());
			pstmt.setString(3, user.getUserName());
			
			resultCnt = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.close(pstmt);
		}
		
		
		
		return resultCnt;
	}

}
