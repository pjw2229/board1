<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>생산관리 조회 & 수정</title>
<script src="https://code.jquery.com/jquery-3.7.1.js">
</script>
</head>
<body>
	<h2>생산관리 조회 & 수정화면</h2>
	<fieldset>
		<legend>생산관리 조회화면</legend>
		<form method="post">
			<ul>
				<li>제품코드&nbsp;<input type="text" value="${product.code}" name="code" id="codeText" readonly></li>
				<li>제품이름&nbsp;<input type="text" value="${product.pname}" name="pname" id="pnameText"></li>
				<li>제품원가&nbsp;<input type="text" value="${product.cost}" name="cost" id="costText"></li>
				<li>목표수량&nbsp;<input type="text" value="${product.pnum}" name="pnum" id="pnumText"></li>
				<li>재고수량&nbsp;<input type="text" value="${product.jnum}" name="jnum" id="jnumText"></li>
				<li>출고가&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" value="${product.sale}" id="saleText" name="sale"></li>
				<li>
					그룹이름
					<select value="${product.gcode}" name="gcode" id="gSelect">
						<option value=""></option>
						<c:forEach var="group" items="${groupcode}">
							<option value="${group.gcode}">${group.gname}</option>
						</c:forEach>
					</select>
				</li>
			</ul>
			<input type="button" value="조회" disabled>
			<input type="submit" formaction="delete" value="삭제" id="delBtn">
			<input type="submit" formaction="update" value="수정" id="updateBtn">
			<input type="button" onclick="location.href='mainMenu'" value="메인화면">
		</form>
	</fieldset>
</body>
</html>