<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Emp Struts App</title>
</head>
<body>
	<s:property value="message" default="Guest"/>
	<s:form action="HelloStruts">
		<s:textfield name="username"></s:textfield>
		<s:submit value="Submit"></s:submit>
	</s:form>
</body>
</html>