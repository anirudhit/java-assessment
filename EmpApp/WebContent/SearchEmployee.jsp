<!DOCTYPE html>
<%@page import="com.jdbc.myapp.Beans.Employee"%>
<%@page import="com.jdbc.myapp.DBConnection.DatabaseConnection"%>
<%@page import="java.sql.*"%>


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
	<div class="wrapper row2">
		<div id="container" class="clear">
			<form action="SearchEmployee.jsp" method="post">
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
			</form>
			
			
			
			<!-- main content -->
			
			<%
				String empId = request.getParameter("empid");
				Connection con=DatabaseConnection.getCon();
				PreparedStatement ps=null;
				Employee emp = new Employee();
				try{
					String sql="select * from employee where empid=?";
					ps=con.prepareStatement(sql);
					ps.setInt(1, Integer.parseInt(empId));
					ResultSet rs=ps.executeQuery();
					if(rs.next()){
						emp.setEmpId(rs.getInt("empid"));
						emp.setEmpName(rs.getString("empname"));
						emp.setSalary(rs.getString("salary"));
						emp.setSkills(rs.getString("skills"));
						emp.setCity(rs.getString("city"));
						emp.setDateOfJoining(rs.getString("dateofjoining"));
						
						
						//session=request.getSession();
			    		//session.setAttribute("SearchEmployeeDetails", emp);
					}
				}
				catch(Exception e){
					e.printStackTrace();
				}
			
			%>
			
			<div style="${emp.getEmpId() eq 0 ? 'display:none' : 'display:block'}">
			<div style="display : <%=  emp.getEmpId() == 0? "none" : "block" %>">
				<table border="1"  align="center" width="750">
					<tr>
						<td>Employee Id</td>
						<td>Employee name</td>
						<td>Date Of Joining</td>
						<td>Salary</td>
						<td>City</td>
						<td>Skills</td>
					</tr>
					
					<%
						Employee employee = (Employee) session.getAttribute("SearchEmployeeDetails");
					%>
					
					<tr>
						<td><%=  emp.getEmpId() %></td>
						<td><%=  emp.getEmpName() %></td>
						<td><%=  emp.getDateOfJoining() %></td>
						<td><%=  emp.getSalary() %></td>
						<td><%=  emp.getCity() %></td>
						<td><%=  emp.getSkills() %></td>
					</tr>
					
				</table>
			</div>
			

			<!-- main content -->

		</div>
	</div>
</div>
	<!-- Footer -->
	<%@include file="footer/Footer.jsp"%>
</body>
</html>
