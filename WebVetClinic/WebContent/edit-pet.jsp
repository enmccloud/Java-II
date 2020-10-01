<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
 <!-- Meta Tags -->
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="Vet Clinic List- Edit List Page">
<meta name="keywords" content="HTML, CSS, Java, Vet Clinic">
<meta name="author" content="Nikki McCloud">

<!-- Bootstrap -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

<title>Edit A Pet</title>

<style>
	body{background-color: lightGray;}
</style>

</head>
<body>

	<div class="container">
		<h2>Edit This Pet</h2>
		<small class="text-muted">Make changes to the Pet's Name or Medication</small>
		<br />
		
	<form action = "editPetServlet" method="post">
	
	<div class="form-group">
		<label for="name">Pet's Name: </label><input type ="text" name = "name" value= "${petToEdit.name}"><br />
	</div>
	
	<div class="form-group">
		<label for="medication">Medication: </label>
		<input type = "text" name = "medication"  value= "${petToEdit.medication}"><br />
	</div>
	
		<input type = "hidden" name = "id" value="${petToEdit.id}">
		<input type = "submit" value="Save Updated Pet Information" class="btn btn-primary">
		
	</form>
	
		<!-- Scripts -->
		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
		
	</div>
</body>
</html>