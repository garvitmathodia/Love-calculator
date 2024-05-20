<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Email-Page</title>
</head>
<body>
<h1>HI ${userInfo.userName}</h1>
<h2>Send Result to your Email</h2>
	<form:form action = "process-email" method = "GET" modelAttribute = "emailDTO">
		<label>Enter Your Email</label>
		<form:input path="userEmail" />
		<input type="Submit" value="send" />
	</form:form>
</body>
</html>