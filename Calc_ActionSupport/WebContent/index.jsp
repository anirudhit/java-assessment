<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags"  prefix="html"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Calculator with Action support</title>
</head>
<body>
	<h1>Calculator Form</h1>
	<html:form action="calc">
		<html:textfield name="firstNumber" label="First number"></html:textfield>
		<html:textfield name="secondNumber" label="Second number"></html:textfield>
		<html:submit value="Add" action="addcalc"></html:submit>
		<html:submit value="Sub" action="subcalc"></html:submit>
		<html:submit value="Mul" action="mulcalc"></html:submit>
		<html:submit value="Div" action="divcalc"></html:submit>
	</html:form>
</body>
</html>