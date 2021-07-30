package service;

import java.io.UnsupportedEncodingException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MemberDao;
import domain.Member;
import util.ConnectionProvider;
import util.CookieBox;

public class LoginCommandImpl implements Command {
	
	Member member = null;
	
	public static boolean login(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
		
		boolean loginChk = false;
		Connection conn = null;
		MemberDao dao = null;
		
		String memberId = request.getParameter("memberid");
		String password = request.getParameter("password");
		String reid = request.getParameter("reid");
		
		if(memberId!=null && password!=null && memberId.trim().length()>2 && password.trim().length()>3){
			
			try{
				conn = ConnectionProvider.getConnection();	
				dao = MemberDao.getInstance();
				
				Member member = dao.selectByIdPw(conn, memberId, password);
				
				if(member != null){
					// 회원의 정보를 Session 객체에 저장 
					request.getSession().setAttribute("loginInfo", member.toLoginInfo());
					loginChk = true;
				}
				
			} catch (SQLException e){
				e.printStackTrace();
			}	  	
		}
		
		if(reid!=null && reid.equals("on")) {
			response.addCookie(CookieBox.makeCookie("reid", memberId, "/", 60*60*24*365));
		} else {
			response.addCookie(CookieBox.makeCookie("reid", memberId, "/", 0));
		}
		
		return loginChk;
	}
	@Override
	public String getPage(HttpServletRequest request, HttpServletResponse response) {
		String viewPage = "index.jsp";
		
		try {
			if(!login(request, response)) {
				viewPage = "/WEB-INF/views/loginForm.jsp";
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return viewPage;
	}

}
