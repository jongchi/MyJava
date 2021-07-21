package user.domain;

import java.sql.Date;

public class User {
	
	private String userId;
	private String pw;
	private String userName;
	private Date regDate;
	
	public User() {}
	
	public User(String userId, String pw, String userName) {
		this.userId = userId;
		this.pw = pw;
		this.userName = userName;
	}
	
	public User(String userId, String pw, String userName, Date regDate) {
		this.userId = userId;
		this.pw = pw;
		this.userName = userName;
		this.regDate = regDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", pw=" + pw + ", userName=" + userName + ", regDate=" + regDate + "]";
	}
	
}
