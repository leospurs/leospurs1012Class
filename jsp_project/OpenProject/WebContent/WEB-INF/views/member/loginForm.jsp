<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>

<style>

#content>form>table td {
	padding: 5px;
}
#content>form input {
	padding: 5px;
}

</style>
</head>
<body>
	
	
	<!-- 헤더 시작 -->
	<%@ include file="/WEB-INF/views/frame/header.jsp" %>
	<!-- 헤더 끝 -->
	
	<!-- 네비게이션 시작 -->
	<%@ include file="/WEB-INF/views/frame/nav.jsp" %>
	<!-- 네이게이션 끝 -->
	
	<!-- content 시작 -->
	<div id="content">
		<h3>로그인</h3>
		<hr>
		<!-- form의 경로와 처리 경로가 동일 -> method로 구분 -->
		<form method="post">
			<table>
				<tr>
					<td>아이디</td>
					<td><input type="text" name="userid" value="${cookie.saveId != null ? cookie.saveId.value : ''}"></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="pw"></td>
				</tr>
				<tr>
					<td></td>
					<td> <input type="checkbox" name="saveid" value="on" ${cookie.saveId != null ? 'checked' : ''}> 아이디 저장하기</td>
				</tr>				
				<tr>
					<td></td>
					<td> <input type="submit" value="로그인"> <input type="reset"> </td>
				</tr>			
			</table>
		
		</form>
	</div>
	<!-- content 끝 -->
	
	<!-- Javascript 추가 -->
	<%@ include file="/WEB-INF/views/frame/footerSet.jsp" %>
</body>
</html>