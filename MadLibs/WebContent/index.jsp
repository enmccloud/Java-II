<%--INDEX PAGE--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MadLib Creation</title>
</head>
<body>
	<h1 style="text-align: center; text-decoration: underline;">Let's Ad-Lib your MadLib!</h1>
	<br>
	<h3 style="text-align: center;">Enter your Answers to the Questions Below</h3>
	<br>
	<br>
	<%--Form for User Input Variables--%>
	<form style = "text-align: center;" action="getMadLibServlet" method="post">
	
		A Name: <input type="text" name="name"><br><br>
		Your Favorite Color:    <input type="text" name="favColor"><br><br>
		An Animal:              <input type="text" name="animal"><br><br>
		A Location: 			<input type="text" name="location"><br><br>
		A Verb:					<input type="text" name="verb"><br><br>
		
		<input type="submit" value="Finish" />
	</form>
</body>
</html>