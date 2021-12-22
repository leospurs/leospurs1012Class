<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 리스트</title>

<%@ include file="/WEB-INF/views/frame/pageset.jsp"%>

</head>
<body>

	<!-- 해더 시작 -->
	<%@ include file="/WEB-INF/views/frame/header.jsp"%>
	<!-- 해더 끝 -->

	<!-- 네비게이션 시작 -->
	<%@ include file="/WEB-INF/views/frame/nav.jsp"%>
	<!-- 네비게이션 끝 -->

	<!-- content 시작 -->
	<div>
		<h3>회원 리스트</h3>
		<hr>
		<div>
			전체 회원 수: 명, 현재 페이지: 1/4 
		</div>
		<table>
			<tr>
				<th>idx</th>
				<th>user ID</th>
				<th>password</th>
				<th>user Name</th>
				<th>photo</th>
				<th>regdate</th>
				<th>manage</th>
			</tr>
			<tr>
				<td>0</td>
				<td>0</td>
				<td>0</td>
				<td>0</td>
				<td>0</td>
				<td>0</td>
				<td>0</td>
			</tr>
		</table>
		<div id="paging">
			1 2 3 4 5 
		</div>
		
	</div>	
	<!-- content 끝 -->


	<!-- Javascript 추가 -->
	<%@ include file="/WEB-INF/views/frame/footerset.jsp" %>

</body>
</html>