<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원 가입</title>
<style>
	td {
		text-align: center;
	}
</style>
<script
    src="https://code.jquery.com/jquery-1.12.4.min.js"
    integrity="sha256-ZosEbRLbNQzLpnKIkEdrPv7lOy9C27hHQ+Xp8a4MxAQ="
    crossorigin="anonymous">
</script>
<script src="user_manager.js"></script>
<script>
</script>
</head>
<body>
	<h1>회원 가입</h1>
	<hr>
	<form id="signUpForm" action="user_signUp.jsp">
		<table border="1">
		<tr>
			<td>아이디</td>
			<td><input type="text" id="userId" name="userId" placeholder="아이디를 입력해주세요." required></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" id="pw" name="pw" placeholder="비밀번호를 입력해주세요." required></td>
		</tr>
		<tr>
			<td>비밀번호 확인</td>
			<td><input type="password" id="repw" placeholder="비밀번호를 입력해주세요." required></td>
		</tr>
		<tr>
			<td>이름</td>
			<td><input type="text" id="userName" name="userName" placeholder="이름을 입력해주세요." required></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="가입"></td>
		</tr>
		
	</table>
	</form>

</body>
</html>