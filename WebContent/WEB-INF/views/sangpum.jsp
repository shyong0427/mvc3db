<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품보기 (MyBatis + Web MVC)</title>
</head>
<body>
	* 상품 자료 (MyBatis + Web MVC) *<br>
	<table border="1">
		<tr>
			<th>code</th><th>sang</th><th>su</th><th>dan</th>
		</tr>
		<c:forEach var="s" items="${data }">
			<tr>
				<td>${s.code }</td>
				<td>${s.sang }</td>
				<td>${s.su }</td>
				<td>${s.dan }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>