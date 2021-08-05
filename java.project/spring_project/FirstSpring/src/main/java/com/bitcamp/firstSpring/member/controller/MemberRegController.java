package com.bitcamp.firstSpring.member.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/member/reg")
public class MemberRegController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String getRegForm() {
		
		return "member/regForm"; //WEB-INF/views/member/regForm.jsp
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String reg(HttpServletRequest request, Model model) {
		
		String memberid = request.getParameter("memberid");
		String password = request.getParameter("password");
		String membername = request.getParameter("membername");
		
		model.addAttribute("memberid", memberid);
		model.addAttribute("password", password);
		model.addAttribute("membername", membername);
		
		return "member/reg";
	}
}

/*
 * rgeForm 경로 통일해서 get일때는 그대로 post일때는 사용자 정보 받아서 출력하는거.
 */
