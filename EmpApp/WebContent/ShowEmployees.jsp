<!DOCTYPE html>
<%@page import="java.util.ArrayList"%>
<%@page import="com.jdbc.myapp.Beans.Employee"%>
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
	<br/>
	<br/>
	<h1 style="text-align: center;">All employee details</h1>
	<br/><br/>
    <%
    		ArrayList<Employee> emp = (ArrayList<Employee>) session.getAttribute("EmployeeListDetails");
	%>
	<table border="1"  align="center" width="750">
		<tr>
			<th>Employee Id</th>
			<th>Employee name</th>
			<th>Date Of Joining</th>
			<th>Salary</th>
			<th>City</th>
			<th>Skills</th>
		</tr>
		
		<%for(Employee e : emp){%>
			<tr>
				<td><%= e.getEmpId() %></td>
				<td><%= e.getEmpName() %></td>
				<td><%= e.getDateOfJoining() %></td>
				<td><%= e.getSalary() %></td>
				<td><%= e.getCity() %></td>
				<td><%= e.getSkills() %></td>
			</tr>
		<%}%>
		
	</table>


	<!-- Footer -->
	<%@include file="footer/Footer.jsp"%>
</body>
</html>
