<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>와이파이 정보 구하기</title>
<script src="https://code.jquery.com/jquery-3.7.1.min.js"
	integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
	crossorigin="anonymous"></script>
</head>
<body style="text-align:center;">
	<h1><span>0</span>개의 WIFI 정보를 정상적으로 저장하였습니다.</h1>
	<a href="main.lsm">홈으로 가기</a>
<script>
document.addEventListener('DOMContentLoaded', function() {
	// 와이파이 정보 가져오고 저장하기
	// open api 연결 후 wifi 정보 가져오기
	$.ajax({
	    url: "http://openapi.seoul.go.kr:8088/4559445973736f6d3637674c746467/xml/TbPublicWifiInfo/1/20",
	    contentType: "application/json",
	    type: "GET",
	    dataType: 'xml',
	    success: function(response) {
	        console.log(response);
	    },
	    error: function(request, status, error) {
	        //console.log(request, status, error);
	    }
	});
});
</script>
</body>
</html>