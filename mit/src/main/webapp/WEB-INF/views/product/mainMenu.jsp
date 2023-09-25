<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>생산관리</title>
</head>
<body>
	<h2>생산관리 시스템</h2>
	<fieldset>
		<legend>생산관리 메인메뉴</legend>
		<input type="button" onclick="location.href='input'" value="제품입력">
		<input type="button" onclick="location.href='check'" value="제품조회">
		<input type="button" onclick="location.href='prior'" value="우선생산제품">
		<input type="button" onclick="location.href='rop'" value="이익순위">
		<input type="button" onclick="location.href='groupBy'" value="그룹별재고수량">
	</fieldset>
</body>
</html>