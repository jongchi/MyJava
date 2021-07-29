package service;

import javax.servlet.http.HttpServletRequest;

public class LoginCommandImpl implements Command {

	@Override
	public String getPage(HttpServletRequest request) {	
		
		request.setAttribute("result", "로그인페이지입니다.");
		
		return "/WEB-INF/login.jsp";
	}

}
