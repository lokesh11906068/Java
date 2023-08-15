<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>

<style>

#admin{
text-align:center;
}
#form{
padding:30px;
text-align:center;
}
input{
padding:10px;
margin:10px;
cursor: pointer;
}
button,a{
text-decoration:none;
padding :10px;
}
a,button{
text-decoration:none;
padding:10px;
margin:10px;
}
</style>
<body>
<div id="admin">
<h2>Admin Login</h2>
<form action="adminlogin" id="form">

<b>Enter Username</b><br>
<input type="text" name="username" placeholder="Ex:lokesh">
<br>
<b>Enter Password</b><br>
<input type="password" name="password" placeholder="123">
<br>
<button><a href="index.jsp">BACK</a></button>

<input type="submit" value="Sign In">
</div>
</form>

</body>
</html>