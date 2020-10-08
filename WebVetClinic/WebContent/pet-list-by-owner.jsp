<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>



<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Vet Clinic List list By Owner Page">
<meta name="keywords" content="HTML, CSS, Java, Vet Clinic">
<meta name="author" content="Nikki McCloud">

<title>Owner Pet List</title>

<style>
	body{background-color: lightGray;}
</style>

<!-- Bootstrap -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
	<form method = "post" action = "petListNavigationServlet">
	<table>
	<c:forEach items="${requestScope.allLists}" var="currentlist">
	<tr>
		<td><input type="radio" name="id" value="${currentlist.id}"></td>
 		<td><h2>${currentlist.petListName}</h2></td></tr>
		<tr><td colspan="3">Appointment Date: ${currentlist.dob}</td></tr>
 		<tr><td colspan="3">Owner: ${currentlist.owner.ownerName}</td></tr>
	 
	 <c:forEach var = "listVal" items = "${currentlist.listOfPets}">
 		<tr><td></td><td colspan="3">${listVal.name}, ${listVal.medication}
 			</td>
	 	</tr>
	 	 </c:forEach>
	</c:forEach>
	</table>
	
	<input type = "submit" value = "edit" name="doThisToList">
	<input type = "submit" value = "delete" name="doThisToList">
	<input type="submit" value = "add" name = "doThisToList">
</form>
	
	<a href="addPetsForListServlet">Create a new Client</a>
	<br/>
	
	<a href="index.html">Insert a new Pet</a>
	
	<!-- Scripts -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	
</body>
</html>