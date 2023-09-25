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
		<form action="checked" method="get">
			<ul>
				<li>제품코드&nbsp;<input type="text" name="code" id="codeText"></li>
				<li>제품이름&nbsp;<input type="text" disabled></li>
				<li>제품원가&nbsp;<input type="text" disabled></li>
				<li>목표수량&nbsp;<input type="text" disabled></li>
				<li>재고수량&nbsp;<input type="text" disabled></li>
				<li>출고가&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" disabled></li>
				<li>
					그룹이름
					<select disabled>
						<option value=""></option>
					</select>
				</li>
			</ul>
			<input type="submit" value="조회">
			<input type="button" value="삭제" disabled>
			<input type="button" value="수정" disabled>
			<input type="button" onclick="location.href='mainMenu'" value="메인화면">
		</form>	
	</fieldset>
</body>
</html>