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
	
	<!-- <form action="GetEmployeeServlet" method="post">
		<div style="padding: 5px">
			<b>Empid</b>
		</div>
		<div style="padding: 5px">
			<input type="text" name="empid"
				style="padding: 5px; border-radius: 5px">
		</div>

		<div style="padding: 5px">
			<input type="submit" value="Search"
				style="padding: 5px; margin: 10px">
		</div>
	</form> -->
	
	<br/>
	<br/>
	<h1 style="text-align: center;">All employee details</h1>
	<br/><br/>
    <%-- <jsp:useBean id="allFestivals" type="java.util.ArrayList" scope="session" /> --%>
	<table border="1"  align="center" width="750">
		<tr>
			<td>Employee Id</td>
			<td>Employee name</td>
			<td>Date Of Joining</td>
			<td>Salary</td>
			<td>City</td>
			<td>Skills</td>
		</tr>
		
	</table>


	<!-- Footer -->
	<%@include file="footer/Footer.jsp"%>
</body>
</html>
