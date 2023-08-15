<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Vegetable</title>
</head>
<style>
#form{
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
</style>


<body>

<form action="updateVegetable" id="form">
		<h1>Update Vegetable</h1>
		
		Enter id<br><input type="number" name="id" placeholder="Enter 1-20"><br>
		Enter Name<br><input type="text" name="name" placeholder="Updatable Name"><br>
		<button><a href="adminlogin.jsp">BACK</a></button>	
		<input type="submit" value="Update">
	
</form>

</body>
</html>