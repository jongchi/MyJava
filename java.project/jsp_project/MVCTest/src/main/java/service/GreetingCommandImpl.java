package service;

import javax.servlet.http.HttpServletRequest;

public class GreetingCommandImpl implements Command {

	@Override
	public String getPage(HttpServletRequest request) {
		
		// 사용자 요청을 처리하고 view의 경로를 반환하는 메소드
		// 결과 데이터를 request 속석에 저장하고 전달 	
			
		request.setAttribute("result", "안녕하세요.");
		
		return "/WEB-INF/views/greeting.jsp";
	}
		

}
