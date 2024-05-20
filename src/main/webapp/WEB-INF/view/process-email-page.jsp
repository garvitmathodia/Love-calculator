<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>process-email</title>
</head>
<body>

<h2>HI ${userInfo.userName}</h2>
<label>Email Successfully sent to ${emailDTO.userEmail}</label>
</body>
</html>