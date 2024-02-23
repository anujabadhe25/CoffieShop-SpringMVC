<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Create Account<br><br>

<form action="createnewaccountdata" method="post">
username<input type="text" name="username">
password<input type="text" name="password">
<input type="submit" value="createaccount">
<input type="reset" value="reset">
<a href="loginpage">Back to Login</a>
</form>
</body>
</html>