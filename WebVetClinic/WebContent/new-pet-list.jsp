<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Vet Clinic List New List Page">
<meta name="keywords" content="HTML, CSS, Java, Vet Clinic">
<meta name="author" content="Nikki McCloud">

<!-- Bootstrap -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<title>Create a New Client</title>

<style>
	body{background-color: lightGray;}
</style>

</head>
<body>

	<form action = "createNewPetListServlet" method="post">
		Pet Name: <input type ="text" name = "petListName"><br />
		Appointment date: 
					<input type ="text" name = "month" placeholder="mm" size="4"> 
				    <input type ="text" name = "day" placeholder="dd" size="4">, 
				    <input type ="text" name = "year" placeholder="yyyy" size="4">
				   
		Owner Name: <input type = "text" name = "ownerName"><br />
		Client Pets:<br />
		
		<select name="allPetsToAdd" multiple size="6">

		<c:forEach items="${requestScope.allPets}" var="currentitem">
 			<option value = "${currentitem.id}">${currentitem.name} | ${currentitem.medication}</option>	
		</c:forEach>
		</select>
	<br />
	
	<input type = "submit" value="Create Owner and Add Pets">
</form>
	<br/>
	<a href = "index.html">Add new pets and medications instead.</a>

<!-- Scripts -->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</body>
</html>