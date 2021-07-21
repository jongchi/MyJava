<%@page import="jdbc.util.JdbcUtil"%>
<%@page import="jdbc.util.ConnectionProvider"%>
<%@page import="java.sql.SQLException"%>
<%@page import="user.dao.UserDao"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	Connection conn = null;
	UserDao dao = UserDao.getInstance();
	
	try{
		conn = ConnectionProvider.getConnection();
		
		request.setAttribute("result", dao.getUserList(conn));
		
	} catch(SQLException e) {
		e.printStackTrace();
	} finally {
		JdbcUtil.close(conn);
	}

%>
<jsp:forward page="user_list_view.jsp"/>