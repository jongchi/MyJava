<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
</style>
<script>
</script>
</head>
<body>

	<h1>회원 가입</h1>
		<form method="post"> 
			<table>
				<tr>
					<td>아이디</td>
					<td>
						${memberid}
					</td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td>${password}</td>
				</tr>
				<tr>
					<td>이름</td>
					<td>${membername}</td>
				</tr>
				<tr>
					<td>사진</td>
					<td><input type="file" name="photo"></td>
				</tr>
				<tr>
					<td></td>
					<td>
						<input type="submit">
						<input type="reset" >
					</td>
				</tr>
			</table>
		</form>
	

</body>
</html>