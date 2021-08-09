package com.bitcamp.op.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.bitcamp.op.member.domain.Member;
import com.bitcamp.op.member.service.LoginService;
import com.bitcamp.op.member.service.MemberRegService;

@Controller
@RequestMapping("/member/memberReg")
public class MemberRegController {
	
	@Autowired
	private MemberRegService regService;

	@RequestMapping(method = RequestMethod.GET)
	public String regForm() {

		return "member/regForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String regMember(
			Member member,
			HttpServletRequest request,
			Model model
			) {
	
			int resultCnt = regService.regMember(member, request, model);
			model.addAttribute("resultCnt", resultCnt);
			
		return "member/memberReg";
	}
	
}
