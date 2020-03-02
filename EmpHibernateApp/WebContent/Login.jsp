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
		<h5 style="text-align: center;">Administrator Login</h5>
		<div id="container" class="clear">
			<div style="width: 200px; margin: 0 auto">
				<form action="AdminLoginServlet" method="post">
					<div style="padding: 5px">
						<b>Username</b>
					</div>
					<div style="padding: 5px">
						<input type="text" name="username"
							style="padding: 5px; border-radius: 5px">
					</div>
					<div style="padding: 5px">
						<b>Password</b>
					</div>
					<div style="padding: 5px">
						<input type="password" name="password"
							style="padding: 5px; border-radius: 5px">
					</div>
					<div style="padding: 5px">
						<input type="submit" value="Login"
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
