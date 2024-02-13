<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="java.text.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
	
	<h2>Enter Employee Details</h2>
	<form action="/Register" method = "post"> 
	 <table>
	 	
	 	<tr>
			<td>ID</td>
			<td><input type="number" name="id" /></td>
		</tr>
	 	<tr>
			<td>First Name</td>
			<td><input type="text" name="firstName" /></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type="text" name="lastName" /></td>
		</tr>
		<tr>
			<td>Location</td>
			<td><input type="text" name="location" /></td>
		</tr>
		<tr>
			<td><input type="Button" value="Save" /></td>
		</tr>
	
	 </table>
	 </form>
		
</body>
</html>