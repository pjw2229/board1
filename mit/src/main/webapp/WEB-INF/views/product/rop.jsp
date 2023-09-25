<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이익순위 제품</title>
</head>
<body>
	<h2>이익순위 제품화면</h2>
	<table border="1">
		<tr>
			<th>제품이름</th>
			<th>총이익 금액</th>
		</tr>
	<c:forEach var="t" items="${table}">
		<tr>
			<td>${t.str}</td>
			<td>${t.no}</td>
		</tr>
	</c:forEach>
	</table>
	<input type="button" onclick="location.href='mainMenu'" value="메인화면">
</body>
</html>