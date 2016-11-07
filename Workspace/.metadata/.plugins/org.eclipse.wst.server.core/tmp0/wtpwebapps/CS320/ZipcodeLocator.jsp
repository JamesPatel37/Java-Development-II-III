<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix= "c" uri= "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Zipcode Locator</title>
<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css'>
</head>
<body>
<div class='container'>
<form action="ZipcodeLocator" method="post">
<hr>
		<h1>Zipcode Locator<br/><small>CS320</small></h1>
		<p class='pull-right'>
		<a href='AirportLocator.jsp' class='btn btn-success'>Find Airports</a></p>
		
<hr/>

<c:if test="${isValidInput}"> Invalid Input </c:if>
<p class='lead'> <h4>City: </h4> <input name='city' type='text' class='form-control'><p>
	  
<p> <input class='btn btn-primary' type='submit' value='Search' /></p>
</form>

<hr>		
</div>

    <h4><i> ${size} zipcode(s) found </i></h4>

 <table class="table table-bordered">
    
    
  	<tr> <th>City</th> <th>Zipcodes</th> </tr>
	<c:if test="${not empty zipcodes}">
	<c:forEach items="${zipcodes}" var="entry">
	<tr>
		<td> ${entry.city} </td>
		<td> ${entry.zip} </td>
	</tr>    
	</c:forEach>
	</c:if>
  	
</table>

</body>
</html>