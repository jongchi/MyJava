<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	
	span {
		color : red;
	}
</style>
<script>
</script>
</head>
<body>
	<%-- ${members} --%>
	
	<h1> 회원 리스트 </h1>
	
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>이름</th>
		</tr>
		
		<c:forEach items="${members}" var="member">
		
		<tr>
			<th>${member.id}</th>
			<th>${member.pw}</th>
			<th>
				<c:out value="${member.name}" escapeXml="false">
				<span>등록된 정보가 없습니다.</span>
				</c:out>
			
			</th>
		</tr>
		
		</c:forEach>
		
	</table>
</body>
</html>