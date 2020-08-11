<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Yahoo!!!!! From JSP</title>
</head>

<body>
<p style="color:blue">
<b>LOGIN PAGE</b>
<p>
<font color="brown" size=16>${errorMessage}</font>

<form action="/login.do" method="post">
Enter your name 
<input type="text" name="name"/>
<p>
Enter your password
<input type="password" name="password"/>
<input type="submit"/>
</form>
</body>
</html>