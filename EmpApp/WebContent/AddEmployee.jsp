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
	<div class="wrapper row2">
		<h5 style="text-align: center;">Add New Employee</h5>
		<div id="container" class="clear">
			<div style="width: 200px; margin: 0 auto">
				<form action="SaveEmployee" method="post">
					<div style="padding: 5px">
						<b>Empid</b>
					</div>
					<div style="padding: 5px">
						<input type="text" name="empid"
							style="padding: 5px; border-radius: 5px">
					</div>
					<div style="padding: 5px">
						<b>Employee Name</b>
					</div>
					<div style="padding: 5px">
						<input type="text" name="empname"
							style="padding: 5px; border-radius: 5px">
					</div>
					<div style="padding: 5px">
						<b>Salary</b>
					</div>
					<div style="padding: 5px">
						<input type="text" name="salary"
							style="padding: 5px; border-radius: 5px">
					</div>
					<div style="padding: 5px">
						<b>Date of Joining</b>
					</div>
					<div style="padding: 5px">
						<input type="text" name="doj"
							style="padding: 5px; border-radius: 5px">
					</div>
					<div style="padding: 5px">
						<b>City</b>
					</div>
					<div style="padding: 5px">
						<select style="padding: 5px; border-radius: 5px" name="city">
							<option>Banglore</option>
							<option>Pune</option>
							<option>Mumbai</option>
							<option>Hyderabad</option>
						</select>
					</div>
					<div style="padding: 5px">
						<b>Skills</b>
					</div>
					<div style="padding: 5px">
						<select style="padding: 5px; border-radius: 5px"
							multiple="multiple" name="skills">
							<option>Java</option>
							<option>.net</option>
							<option>java 8</option>
							<option>spring</option>
							<option>Rest api</option>
						</select>
					</div>
					<div style="padding: 5px">
						<input type="submit" value="Save"
							style="padding: 5px; margin: 10px">
					</div>
				</form>

			</div>

		</div>
	</div>
	<!-- Footer -->
	<%@include file="footer/Footer.jsp"%>
</body>
</html>
