<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>result-page</title>
</head>
<body>

	<h1 align="center">The Love Calculator Predicts:</h1>
	<br>
	${userInfo.userName} and ${userInfo.crushName} are
	<br>
	${apresult}
	<br>
	<a href = "/SpringLoveCalculator/sendEmail">Send Result to your Email</a>
	
</body>
</html>