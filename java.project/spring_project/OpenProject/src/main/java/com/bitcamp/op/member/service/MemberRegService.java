package com.bitcamp.op.member.service;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.multipart.MultipartFile;

import com.bitcamp.op.jdbc.ConnectionProvider;
import com.bitcamp.op.member.dao.MemberDao;
import com.bitcamp.op.member.domain.Member;

@Service
public class MemberRegService {
	
	@Autowired
	MemberDao dao;
	
	final String UPLOAD_URI = "/uploadfile";

	
	public int regMember(Member member, HttpServletRequest request, Model model) {
		
		int resultCnt = 0;
		
		Connection conn = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			
			resultCnt = dao.insertMember(conn, member);
			
			if(member.getMemberphoto()!= null) {
				saveFile(request, member.getMemberphoto());			
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return resultCnt;
	}
	
	private void saveFile(HttpServletRequest request, MultipartFile file) throws IllegalStateException, IOException {
		// 저장 경로 : 시스템 경로
		String saveDir = request.getSession().getServletContext().getRealPath(UPLOAD_URI);
		
		// 새롭게 저장할 파일
		File newFile = new File(saveDir, file.getOriginalFilename());
		file.transferTo(newFile);
	}
}
