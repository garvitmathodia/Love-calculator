<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
	<h1 align="center">Please register here</h1>


	<form:form action="registration-Success" method="GET"
		modelAttribute="userReg">
		<div align="center">
			<label>User :</label>
			<form:input path="name" />
			<form:errors path = "name"/>
			
			<br> <br> 
			
			<label>User Name :</label>
			<form:input path ="username" />
			<form:errors path = "username"/>
			
			<br> <br> 
			
			<label>Password :</label>
			<form:input path="password" />
			
			<br> <br>
			
			<label>Country :</label>
			<form:select path="countryName">
				<form:option value="Ind" label="India"></form:option>
				<form:option value="USA" label="United States"></form:option>
				<form:option value="Pak" label="Pakistan"></form:option>
				<form:option value="SL" label="SriLanka"></form:option>
			</form:select>
			
			<br> <br> 
			
			<label>Hobbies :</label> 
			Cricket :
			<form:checkbox path="hobbies" value="cricket" />
			Reading :
			<form:checkbox path="hobbies" value="reading" />
			Travel :
			<form:checkbox path="hobbies" value="travel" />
			Programming :
			<form:checkbox path="hobbies" value="programming" />
			<br> <br> 
			
			<label>Gender :</label> 
			
			Male
			<form:radiobutton path="gender" value="male" />
			Female
			<form:radiobutton path="gender" value="female" />
			<br>
			<br>
			 
			<label>Age</label>
			<form:input path="age" />
			<form:errors path="age" />
			<br>
			<br>
		</div>

		<div align="center">
			<h3>Communication</h3>

			<label>Email</label>
			<form:input path="communicationDTO.email" />
			<form:errors path="communicationDTO.email"/>
			
			<br>
			<br>

			<label>Phone</label>
			<form:input path="communicationDTO.phone" />


		</div>

		<div align="center">
			<br> <input type="submit" value="register">
		</div>
	</form:form>
</body>
</html>
