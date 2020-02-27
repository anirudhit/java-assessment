<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="html" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Emp Struts App</title>
</head>
<body>
	<h1>Employee registration form:</h1>
	<html:form action="EmployeeRegistration">
		<html:textfield name="name" label="Name"/>
		<html:textfield name="email" label="Email"/>
		<html:textarea name="address" label="Address"/>
		<html:submit value="Register"/>
	</html:form>
</body>
</html>