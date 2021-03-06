<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Media</title>
<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css'></head>
</head>

<body>
<div class='container'>

<form action="AddMedia" method="post">

<hr>
		<h1>Add a Media<br/><small>CS320</small></h1>
		<p class='pull-right'>
		<a href='ViewLibrary' class='btn btn-success'>View Library</a></p>
<hr/>

<c:if test="${not empty nameError}"> ${nameError}</c:if><br>
Name: <p class='lead'><input name='name' type='text' class='form-control'><p>

<c:if test="${not empty typeError}"> ${typeError}</c:if><br>
Type: <p class="lead">
<select name="select" id="select">
		<option selected value="1">--Select One--</option>
		<option value="CD">CD</option>
		<option value="DVD">DVD</option>
		<option value="BlueRay">Blue-Ray</option>
	</select>
	</p>
	
<p> <input class='btn btn-primary' type='submit' value='Add' /></p>
</form>

</body>
</html>