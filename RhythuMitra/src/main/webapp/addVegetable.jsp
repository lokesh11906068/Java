<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Book</title>
</head>

<style>

#form{
text-align:center;

}
input{
padding :10px;
margin:10px;
cursor: pointer;
}
button,a{
text-decoration:none;
padding :10px;

}
</style>
<body>

<form action="addbook" id="form">
		<h1>Add Vegetable</h1>
		
		Enter Name<br><input type="text" name="name" placeholder="Vegetable Name"><br>
		Enter price<br><input type="number" name="price" placeholder="Ex:20"><br>
		Enter Origin<br><input type="text" name="origin" placeholder="Ex:South India"><br>
		Enter Availability<br><input type="number" name="availability" placeholder="Ex:10"><br>
		<button><a href="adminlogin.jsp">BACK</a></button>
		<input type="submit" value="ADD">
	
</form>

</body>
</html>