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
		<div id="container" class="clear">
			<form action="fetchEmployeeServlet" method="post">
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

			<!-- main content -->

		</div>
	</div>
	<!-- Footer -->
	<%@include file="footer/Footer.jsp"%>
</body>
</html>
