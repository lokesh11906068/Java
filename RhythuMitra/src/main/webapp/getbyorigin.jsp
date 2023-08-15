<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Getting Vegetables by name</title>
</head>
<style>

#form{
text-align:center;
}
input{
padding:10px;
margin:10px;
}
a,button{
text-decoration:none;
padding:10px;
margin:10px;
}
</style>
<body>

<form action="getbyorigin" id="form">

		<h2>Enter Vegetable Origin to Show the List</h2>
		
		<input type="text" name="origin" placeholder="Ex:South India"><br>
		<button><a href="user.jsp">BACK</a></button>
		<input type="submit" value="Get">
		
		
	
</form>

</body>
</html>