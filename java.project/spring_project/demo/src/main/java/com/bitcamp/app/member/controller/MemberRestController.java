package com.bitcamp.app.member.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitcamp.app.member.domain.Member;
import com.bitcamp.app.member.service.MemberRestService;

//@Controller
@RestController
public class MemberRestController {
	
	@Autowired
	private MemberRestService restService;
	
	@RequestMapping("/members/{id}")
	@CrossOrigin
	public Member getMember(
			@PathVariable("id")int idx
			) {
		
		Member member = restService.getMember(idx);
		System.out.println(member);
		
		return member;
	}
	
	@GetMapping("/members")
	@CrossOrigin
	public List<Member> getMembers(){
		return restService.getMembers();
	}
	
	@GetMapping("/members1")
	@CrossOrigin
	public Map<Integer, Member> getMembers1(){
		
		return restService.getMembers1();
		
	}
}
