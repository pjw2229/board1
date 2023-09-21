<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="../includes/header.jsp" %><%--헤더 파일 넣기 --%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>삭제 화면</title>
</head>
<body>
	<div id="page-wrapper">
		<div class="row">
        	<div class="col-lg-12">
        		<div class="panel panel-default">
					<div class="panel-body">
						<div class="row">
							<div class="col-lg-6">
								${bno}번 항목을 삭제하기 위해서는 비밀번호가 필요합니다.<br>
								<input type="password" name="pw"><br>
								<button>확인</button>
							</div>
						</div>
					</div>
				</div>
        	</div>
        </div>
	</div>
<%@ include file="../includes/footer.jsp" %>
</body>
</html>