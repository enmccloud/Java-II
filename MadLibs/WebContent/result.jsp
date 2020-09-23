<%--RESULT PAGE--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MadLib Results</title>
</head>
<body>
	<h1 style="text-align: center; text-decoration:underlined;">Let's Read Your MadLib!</h1>
	
	<br><br>
	
	<%--Finished MadLib w/ User Input Variables--%>
	<p style="text-align: center;">${inputMadLib.getName() } is looking at picking out a new ${inputMadLib.getFavColor()} couch. <br>
	They think to themselves, "My pet ${inputMadLib.getAnimal() } would love this!"
	<br> They then ${inputMadLib.getVerb() } to the ${inputMadLib.getLocation() }, where they  realized they left the couch at the store! <br>
	</p>

	<br>
	
	<a href="index.jsp">Click Here to Play Again!</a>

</body>
</html>