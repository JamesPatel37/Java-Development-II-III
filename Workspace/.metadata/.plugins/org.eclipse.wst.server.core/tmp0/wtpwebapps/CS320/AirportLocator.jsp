<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix= "c" uri= "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Airport Locator</title>
<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css'>
</head>
<body>
<div class='container'>
<form action="AirportLocator" method="post">
<hr>
		<h1>Airport Locator<br/><small>CS320</small></h1>
		<p class='pull-right'>
		<a href='ZipcodeLocator' class='btn btn-success'>Find Zipcodes</a></p>
		
<hr/>

<c:if test="${isValidInput}"> Invalid Input </c:if>
<h3>Zipcode: </h3> <p class='lead'> <input name='zipcode' type='text' class='form-control'><p>
<h3>Search Area: </h3> <p class='lead'> <input name='radius' type='text' class='form-control'><p>


<p> <input class='btn btn-primary' type='submit' value='Search' /></p>
</form>

<hr>		
</div>

    <h4><i> ${size} airport(s) found </i></h4>

 <table class="table table-bordered">
    
    
  	<tr> <th>Airports</th> </tr>
	<c:if test="${not empty airports}">
	<c:forEach items="${airports}" var="entry">
	<tr>
		<td> ${entry.airport} </td>
	</tr>    
	</c:forEach>
	</c:if>
  	
</table>

</body>
</html>