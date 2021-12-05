<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>Hello World!! (board list)</h1>
<img src="./img/menu8-2.png" width="300"/>
<table>
<c:forEach items = "${list}" var = "one">
	<tr><td>${one}</td></tr>
</c:forEach>
</table>
</body>
</html>