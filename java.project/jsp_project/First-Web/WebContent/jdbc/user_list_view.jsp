<%@page import="user.domain.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% List<User> list = (List<User>) request.getAttribute("result"); %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원 정보 list</title>
<style>

	th {
		border: 1px solid #000;
	}
	td {
		border: 1px solid #888;
		text-align: center;
	}
	
</style>
<script>
</script>
</head>
<body>
	<h1>회원 정보</h1>
	<hr>
	
	<table>
		<tr>
			<th>회원 ID</th>
			<th>비밀번호</th>
			<th>회원 이름</th>
			<th>가입일</th>
		</tr>
	<%
		if(list!=null){
			for(int i=0;i<list.size();i++){
				%>
		<tr>
			<td><%= list.get(i).getUserId() %></td>
			<td><%= list.get(i).getPw() %></td>
			<td><%= list.get(i).getUserName() %></td>
			<td><%= list.get(i).getRegDate() %></td>
		</tr>
				<%
			}
		}
	%>
	
	</table>
	<button onclick="location.href='user_signUpForm.jsp'">회원 가입</button>
</body>
</html>