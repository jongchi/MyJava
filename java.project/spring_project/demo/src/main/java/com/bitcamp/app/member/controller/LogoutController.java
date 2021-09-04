package com.bitcamp.app.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogoutController {
	
	@RequestMapping("/member/logout")
	private String logout(Model model, HttpServletRequest request, HttpSession session) {
		boolean loginChk = false;
		System.out.println(request.getSession());
		session.invalidate();
		
		return "index";
	}
}
