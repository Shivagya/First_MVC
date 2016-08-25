<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to login page.</title>
</head>
<body>

<h4>Fill the details to login. </h4> <br><br>
<hr>
<form action="LoginController" method="post">

USERNAME : <input type="text" name="username" placeholder="Username" required><br>
PASSWORD : <input type="password" name="password" placeholder="Password" required><br>	
<input type="submit" value="submit"><br>

</form>

</body>
</html>