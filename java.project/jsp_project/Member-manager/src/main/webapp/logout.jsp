<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	// 현재 세션객체 소멸
	session.invalidate();
%>
<script>
	alert('로그아웃되었습니다.');
	location.href = '${pageContext.request.contextPath}';
</script>