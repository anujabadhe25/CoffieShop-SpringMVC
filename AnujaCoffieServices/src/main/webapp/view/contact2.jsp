<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
ContactPage

<a href="homepage">Home</a>
<a href="aboutpage">About</a>
<a href="servicepage">Service</a>
<a href="contactpage">Contact</a>
<a href="loginpage">LogOut</a><br><br>

<form action="contactdata" method="post">

name<input type="text" name="name"><br><br>
address<input type="text" name="address"><br><br>
email<input type="text" name="email"><br><br>
mobile<input type="text" name="mobile"><br><br>
<input type="submit" value="submit"><br><br>
<input type="reset" value="reset"><br><br>

</form>
</body>
</html>