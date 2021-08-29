package com.bitcamp.op;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/index")
	public void index() {
	}
	
	@RequestMapping("/")
	public String index1() {
		System.out.println("/ 진입");
		return "redirect:/index";
	}
	
	@RequestMapping("/index2")
	public String index2() {
		return "index2";
	}
	
	@RequestMapping("/juso")
	public String juso() {
		return "juso" ;
	}
	
	@RequestMapping("/popup/jusoPopup")
	public String jusoPopup() {
		return "popup/jusoPopup";
	}
}
