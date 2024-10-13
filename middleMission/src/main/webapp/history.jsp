<%@ page import="java.util.List"%>
<%@ page import="dto.LocateDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% 
    // param
    List<LocateDTO> dtos = (List<LocateDTO>) request.getAttribute("dtos");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>위치 히스토리 목록</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js"
	integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
	crossorigin="anonymous"></script>
	
<style>
.href {
	margin-bottom: 15px;
}

.href a::after {
	content: '';
	width: 1px;
	height: 12px;
	display: inline-block;
	background: #551A8B;
	margin-left: 5px;
}

.href a:last-child::after {
	display: none;
}

form {
	margin-bottom: 10px;
}

table {
	border-collapse: collapse;
	border: 1px solid #ddd;
}

tr:nth-child(even) {
	background-color: #fff;
}

tr:nth-child(odd) {
	background-color: #E7E9EB;
}

th {
	background-color: #04AA6D;
	color: #fff;
	border-right: 1px solid #fff;
	padding: 10px 15px;
}

th:last-child {
	border-right: none;
}

td {
	padding: 10px 15px;
}
</style>
</head>
<body>
	<h1>위치 히스토리 목록</h1>
	<div class="href">
		<a href="main.lsm">홈</a> <a href="history.lsm">위치 히스토리 목록</a> <a href="#">Open API
			와이파이 정보 가져오기</a>
	</div>
	<table>
		<tr>
			<th>ID</th>
			<th>x좌표</th>
			<th>y좌표</th>
			<th>조회일자</th>
			<th>비고</th>
		</tr>

		<%
		if (dtos != null && !dtos.isEmpty()) {
	        for (LocateDTO dto : dtos) {
	        %>
	        <tr>
				<td><%=dto.getIdx() %></td>
				<td><%=dto.getxPosition() %></td>
				<td><%=dto.getyPosition() %></td>
				<td><%=dto.getSeleteDate() %></td>
				<td><input type="button" value="삭제"></td>
			</tr>
			<%
			}
		 } else {
			%>
    <td colspan="4">No data available</td>
	<%
	    }
	%>
	</table>
</body>
</html>