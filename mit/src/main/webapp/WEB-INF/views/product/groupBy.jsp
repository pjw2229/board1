<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>그룹별 재고 수량</title>
</head>
<body>
	<h2>그룹별 재고 수량 화면</h2>
	<table border="1">
		<tr>
			<th>그룹이름</th>
			<th>재고수량</th>
		</tr>
	<c:forEach var="a" items="${amount}">
		<tr>
			<td>${a.gname}</td>
			<td>${a.amount}</td>
		</tr>
	</c:forEach>
	</table>
	<input type="button" onclick="location.href='home.jsp'" value="메인화면">
</body>
</html>