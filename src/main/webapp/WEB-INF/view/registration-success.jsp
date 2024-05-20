<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Success</title>
</head>
<body>
<h1>Your Registration is Successful</h1>
<h2>The details entered by you are:</h2>
user : ${userReg.name}<br>
userName : ${userReg.username}<br>
password : ${userReg.password}<br>
countryName : ${userReg.countryName}<br>
Hobbies : ${userReg.hobbies}<br>
Gender : ${userReg.gender}<br>
Age : ${userReg.age}<br>
Email : ${userReg.communicationDTO.email}<br>
Phone : ${userReg.communicationDTO.phone}<br>
</body>
</html>