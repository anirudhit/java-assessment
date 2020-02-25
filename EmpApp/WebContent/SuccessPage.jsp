<%-- <!DOCTYPE html>
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
</html> --%>

<!DOCTYPE html>
<html lang="en" dir="ltr">
<head>
<title>Emp App</title>
<meta charset="UTF-8">
<link rel="stylesheet" href="styles/layout.css" type="text/css">
<!--[if lt IE 9]><script src="scripts/html5shiv.js"></script><![endif]-->
</head>
<body>
	<%@include file="header/Header.jsp"%>


	<!-- content -->
	<div style="text-align: center">
		<h1>Employee details are updated.</h1>
	</div>


	<!-- Footer -->
	<%@include file="footer/Footer.jsp"%>
</body>
</html>

