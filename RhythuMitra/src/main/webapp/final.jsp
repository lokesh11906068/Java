<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>

<style>
a,button{
text-decoration:none;
padding:10px;
margin:10px;
}
body{
text-align:center;
}
</style>
</head>

<body>
<h2>${message}</h2>

<%-- <b>ID::</b>${vegetables.id}
<b>NAME::</b>${vegetables.name}
<b>PRICE::</b>${vegetables.price}
<b>Origin::</b>${vegetables.origin}
<b>Availabilty::</b>${vegetables.availability} --%>

<h3>${vegetables}</h3>
<button><a href="user.jsp">BACK</a></button>

</body>
</html>