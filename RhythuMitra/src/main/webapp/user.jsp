<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Page</title>
</head>
<style>
#user{
	
	text-align :center;
	
}
a,button{
text-decoration:none;
padding:10px;
margin:10px;
}

input{
padding:10px;
margin:10px;
cursor:pointer;
}
</style>
</head>
<body id="user"><h1>User DashBoard</h1>
<button><a href="getbyid.jsp">Get By Id</a></button><br>
<button><a href="getbyname.jsp">Get By Name</a></button><br>
<button><a href="getbyorigin.jsp">Get By Origin</a></button><br>
<form action="getall" >
<input type="submit" value="Show All Vegetables">
</form>
<button><a href=userlogin.jsp>BACK</a></button>


</body>
</html>