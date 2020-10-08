<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<title>Reservation Form</title>
<style>
.error {
	color: red
}
</style>
</head>
<body>
	<form:form action="helloagain" modelAttribute="emp">  
            Username: <form:input path="name" />
		<br>
		<br>  
            Password: <form:input path="pass" />
		<br>
		<br>
		<form:errors path="pass" cssClass="error" />
		<br>
		<br>  
            Age: <form:input path="age" />
		<form:errors path="age" cssClass="error" />
		<br>
		<br> 
		<input type="submit" value="Submit" />
	</form:form>
</body>
</html>
