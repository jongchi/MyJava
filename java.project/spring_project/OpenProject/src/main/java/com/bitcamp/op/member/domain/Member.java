package com.bitcamp.op.member.domain;

import java.io.File;
import java.sql.Timestamp;
import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class Member {
	
	private int idx;
	private String memberid;
	private String password;
	private String membername;
	private MultipartFile memberphoto;
	private Timestamp regdate;
	
	public Member(int idx, String memberid, String password, String membername, MultipartFile memberphoto, Timestamp regdate) {
		this.idx = idx;
		this.memberid = memberid;
		this.password = password;
		this.membername = membername;
		this.memberphoto = memberphoto;
		this.regdate = regdate;
	}
	
	public Member() {}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getMemberid() {
		return memberid;
	}

	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMembername() {
		return membername;
	}

	public void setMembername(String membername) {
		this.membername = membername;
	}

	public Timestamp getRegdate() {
		return regdate;
	}

	public void setRegdate(Timestamp regdate) {
		this.regdate = regdate;
	}
	
	public MultipartFile getMemberphoto() {
		return memberphoto;
	}

	public void setMemberphoto(MultipartFile memberphoto) {
		this.memberphoto = memberphoto;
	}

	// java.sql.TimeStamp -> java.util.Date
	public Date getDate() {
		return new Date(getRegdate().getTime());
	}

	@Override
	public String toString() {
		return "Member [idx=" + idx + ", memberid=" + memberid + ", password=" + password + ", membername=" + membername
				+ ", memberphoto=" + memberphoto + ", regdate=" + regdate + "]";
	}

	// Member -> LoginInfo
	public LoginInfo toLoginInfo() {
		return new LoginInfo(this.idx, this.memberid, this.membername, this.memberphoto);
	}
	

}