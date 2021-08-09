package com.bitcamp.op.member.domain;

import java.io.File;

import org.springframework.web.multipart.MultipartFile;

public class LoginInfo {

	private int idx;
	private String memberId;
	private String memberName;
	private MultipartFile memberPhoto;

	public LoginInfo(int idx, String memberId, String memberName, MultipartFile memberPhoto) {
		this.idx = idx;
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberPhoto = memberPhoto;
	}

	public int getIdx() {
		return idx;
	}

	public String getMemberId() {
		return memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	
	public MultipartFile getMemberPhoto() {
		return memberPhoto;
	}

	@Override
	public String toString() {
		return "LoginInfo [idx=" + idx + ", memberId=" + memberId + ", memberName=" + memberName + ", memberPhoto="
				+ memberPhoto + "]";
	}

}