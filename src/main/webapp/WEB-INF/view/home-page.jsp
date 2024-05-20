<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home-Page</title>
</head>

<body>

	<h1 align="center">Love Calculator</h1>

	<form:form action="process-homepage" method="get" modelAttribute = "userInfo">
		<div align="center">
			<p>
				<label for=" yn"> Your Name :</label> 
				<form:input type = "text" id = "yn" path="userName" />
				<form:errors path = "userName" />
			</p>

			<p>
				<label for=" cn"> Crush Name :</label>
				 <form:input type = "text" id = "cn" path="crushName" />
				 <form:errors path = "crushName" />
			</p>
			
			<p>
			<form:checkbox path = "termAndConditions" id = "check" />
			<label>check the box</label>
			<form:errors path = "termAndConditions" />
			</p>

			<input type="submit" value="calculate" />
		</div>
	</form:form>

</body>
</html>