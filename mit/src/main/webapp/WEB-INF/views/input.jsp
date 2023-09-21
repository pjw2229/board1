<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>생산관리 등록</title>
</head>
<body>
	<h2>생산관리 등록화면</h2>
	<fieldset>
		<legend>생산관리 등록화면</legend>
		<form action="create" method="post">
			<ul>
				<li>제품코드&nbsp;<input type="text" name="code"></li>
				<li>제품이름&nbsp;<input type="text" name="pname"></li>
				<li>제품원가&nbsp;<input type="text" name="cost"></li>
				<li>목표수량&nbsp;<input type="text" name="pnum"></li>
				<li>재고수량&nbsp;<input type="text" name="jnum"></li>
				<li>출고가&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="sale"></li>
				<li>
					그룹이름
					<select name="gcode">
						<c:forEach var="group" items="${groupcode}">
							<option value="${group.gcode}">${group.gname}</option>
						</c:forEach>
					</select>
				</li>
			</ul>
			<input type="submit" value="등록">
			<input type="button" onclick="location.href='home.jsp'" value="메인화면">
		</form>
	</fieldset>
</body>
</html>