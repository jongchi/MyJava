<%@page import="jdbc.util.JdbcUtil"%>
<%@page import="user.domain.User"%>
<%@page import="java.sql.SQLException"%>
<%@page import="jdbc.util.ConnectionProvider"%>
<%@page import="user.dao.UserDao"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
	request.setCharacterEncoding("utf-8");
	
	String userId = request.getParameter("userId");
	String pw = request.getParameter("pw");
	String userName = request.getParameter("userName");
	
	int resultCnt = 0;
	
	Connection conn = null;
	UserDao dao = null;
	
	try{
		conn = ConnectionProvider.getConnection();
		dao = UserDao.getInstance();
		
		resultCnt = dao.signUp(conn, new User(userId, pw, userName));
				
	} catch(SQLException e) {
		e.printStackTrace();
	} finally {
		JdbcUtil.close(conn);
	}
	
	if(resultCnt>0){
		%>
		<script>
		alert('회원가입이 정상적으로 처리되었습니다.');
		location.href="user_list.jsp";
		</script>
		<% 
	} else{
		%>
		<script>
		alert('오류로 인해 회원가입이 되지 않았습니다. 다시 시도해주세요.');
		location.href="user_signUpForm.jsp";
		</script>	
		<%		
	}	
%>
