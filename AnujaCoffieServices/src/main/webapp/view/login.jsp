<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

Login<br><br>

//USER<br><br>
<form action="logindata" method="post">
username<input type="text" name="username"><br><br>
password<input type="text" name="password"><br><br>
<input type="submit" value="login"><br><br>
<input type="reset" value="reset"><br><br>
</form>


<a href="createnewaccountpage">Create New Account</a>

<br>

//ADMIN<br><br>
<form action="logindata" method="post">

username<input type="text"><br><br>
password<input type="text"><br><br>
<input type="submit" value="login"><br><br>
<input type="reset" value="reset"><br><br>
<a href="createnewaccountpage">Create New Account</a>
</form>
</body>
</html>