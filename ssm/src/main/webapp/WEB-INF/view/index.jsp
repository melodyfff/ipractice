<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 加入标题图片 -->
<!-- <link rel="icon" href="./fa.ico" type="image/x-icon" /> -->
<link type="image/x-icon" rel="shortcut icon" href="./fa.ico" />
<!-- 加入bootstrap -->
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<script src="static/jquery.min.js"></script>
<script src="static/js/bootstrap.min.js"></script>

<title>index</title>
</head>
<body>
pageContext.request.contextPath:${pageContext.request.contextPath}
<a href="${pageContext.request.contextPath}/user/showUser">显示所有用户</a>
</body>
</html>