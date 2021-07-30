
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
	<nav>
		<ul>
			<c:if test="${loginInfo eq null}">
				<li><a href="<c:url value='/regform.do'/>">회원가입</a></li>
				<li><a href="<c:url value='loginform.do'/>">로그인</a></li>
			</c:if>
			<c:if test="${loginInfo ne null}">
				<li><a href="<c:url value='logout.do'/>">로그아웃</a></li>
				<li><a href="<c:url value='list_view.do'/>">회원리스트</a></li>		
			</c:if>		
			
			<li><a href="<c:url value='/mypage.do'/>">MyPage</a></li>
		</ul>
	</nav>