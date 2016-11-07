<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix= "c" uri= "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Quotation</title>
<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css'>
</head>
<body>
<div class='container'>
<form action="AddQuotationController" method="post">
<hr>
		<h1>Add a Quotation<br/><small>CS320</small></h1>
		<p class='pull-right'>
		<a href='QuotationController' class='btn btn-success'>View Quotations</a></p>
<hr/>

<c:if test="${not empty quotationError}"> ${quotationError}</c:if>
Quotation: <p class='lead'> <input name='quotation' type='text' class='form-control'><p>

<c:if test="${not empty authorError}"> ${authorError}</c:if>
Author:    <p class='lead'> <input name='author' type='text' class='form-control'><p>
	  
<p> <input class='btn btn-primary' type='submit' value='Add' /></p>
</form>

</div>
</body>
</html>