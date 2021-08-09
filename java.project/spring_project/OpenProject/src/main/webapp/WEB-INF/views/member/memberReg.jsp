<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:if test="${resultCnt <= 0 }">
<script>
alert('회원가입에 실패했습니다. 다시 시도해주세요.');
history.go(-1);
</script>
</c:if>
<c:if test="${resultCnt > 0 }">
<script>
	location.href = '<c:url value="/"/>';
</script>
</c:if>