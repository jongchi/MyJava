package com.bitcamp.firstSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitcamp.firstSpring.dao.Dao;
@Service
public class FileUploadService {
	
	@Autowired
	Dao dao;
	
	final String UPLOAD_URI = "/uploadfile";
	
	public void fileUpload() {
		dao.insert();
	}
}
