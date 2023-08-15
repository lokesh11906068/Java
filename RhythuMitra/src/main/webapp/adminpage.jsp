<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>

<style>
#admin{
	
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
<body id="admin"><h1>Admin DashBoard</h1>
<button><a href="addVegetable.jsp">Add Vegetable</a></button><br>
<button><a href="updateVegetable.jsp">Update Vegetable</a></button><br>
<button><a href="deleteVegetable.jsp">Delete Vegetable</a></button><br>
<form action="getall" >
<input type="submit" value="Show All Vegetables">
</form>
<button><a href="adminlogin.jsp">BACK</a></button>



</body>
</html>