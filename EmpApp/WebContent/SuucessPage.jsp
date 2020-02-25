<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
<%@page import="com.jdbc.myapp.Beans.Employee"%>
<title>Emp App</title>
<meta charset="UTF-8">
</head>
<body>
	<%
		int emp = (Integer) request.getAttribute("somedata");
		session.setAttribute("employeedata", null);
		session.removeAttribute("employeedata");
	%>
	<h2><%=emp%></h2>
</body>
</html>
