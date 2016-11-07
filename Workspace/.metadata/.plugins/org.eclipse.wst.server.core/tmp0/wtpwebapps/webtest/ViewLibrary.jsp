<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix= "c" uri= "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css'>
</head>


<body>

<div class='container'>
<form action="ViewLibrary" method="post">
	<hr>	
		<h1>Library<br/><small>CS320</small></h1>
		
		<p class='lead'><input name='search' type='text' class='form-control'> <br/>
		<input type = 'submit' name = 'submit' value = 'Search'/>

</form>
<hr>		
</div>


  <table class="table table-bordered">
  
  <tr> <th align="center" colspan='7'>Compact Discs</th> </tr>
  
  	<tr> <th>ID</th> <th>Media Name</th> <th>Media Type</th> <th>Date Added</th> <th>On Loan</th> <th>Date Borrowed</th> <th>Borrower</th></tr>
		
	<c:forEach items= "${cdata}" var="data"> 
	 <tr>
		<td>${data.id}</td>
		<td>${data.name} </td>
		<td>${data.type} </td>
		<td>${data.dateAdded} </td>
		
		<td> 
	 		<c:choose>

    			<c:when test="${data.loan==true}"> YES  </c:when>

      			<c:otherwise>NO</c:otherwise>
      
			</c:choose> 	
		</td>
	
		<td>${data.dateBorrowed} </td>
		<td>
			<c:choose>
	 
      			<c:when test="${data.borrower==null}"> <a href="Lend?id=${data.id}">Lend</a>  </c:when>

      			<c:otherwise>${data.borrower} <a href="ViewLibrary?ReturnId=${data.id}"> return </a> </c:otherwise>
      
		</c:choose> 
		</td>
	
	 </tr>
	</c:forEach>
</table>
     
    <hr>
    
<table class="table table-bordered">

	<tr> <th colspan='7'>Digital Video Discs</th> </tr>
     
  <tr> <th>ID</th> <th>Media Name</th> <th>Media Type</th> <th>Date Added</th> <th>On Loan</th> <th>Date Borrowed</th> <th>Borrower</th></tr>
	 <c:forEach items= "${cdatadvd}" var="data"> 
	 <tr>
	<td>${data.id}</td>
	<td>${data.name} </td>
	<td>${data.type} </td>
	<td>${data.dateAdded} </td>
	<td> 
	
	 <c:choose>
	 
      	<c:when test="${data.loan==true}"> YES  </c:when>

      	<c:otherwise>NO</c:otherwise>
      
	  </c:choose> 
	
	</td>
	<td>${data.dateBorrowed} </td>
	<td>
	
	 <c:choose>
	 
      <c:when test="${data.borrower==null}"> <a href="Lend?id=${data.id}">Lent</a>  </c:when>

      <c:otherwise>${data.borrower} <a href="ViewLibrary?ReturnId=${data.id}"> return </a> </c:otherwise>
      
		</c:choose> 
	
	</td>
	 </tr>
	 </c:forEach>
</table>

     <hr>

<table class="table table-bordered">
	<tr> <th align="center" colspan='7'>Blu-Ray Discs</th> </tr>

  	<tr> <th>ID</th> <th>Media Name</th> <th>Media Type</th> <th>Date Added</th> <th>On Loan</th> <th>Date Borrowed</th> <th>Borrower</th></tr>
	 <c:forEach items= "${cdatabr}" var="data"> 
	 <tr>
	<td>${data.id}</td>
	<td>${data.name} </td>
	<td>${data.type} </td>
	<td>${data.dateAdded} </td>
	<td> 
	
	 <c:choose>
	 
      <c:when test="${data.loan==true}"> YES  </c:when>

      <c:otherwise>NO</c:otherwise>
      
		</c:choose> 
	
	</td>
	<td>${data.dateBorrowed} </td>
	<td>
	
	
	 <c:choose>
	 
      <c:when test="${data.borrower==null}"> <a href="Lend?id=${data.id}">Lent</a> </c:when>

      <c:otherwise>${data.borrower} <a href="ViewLibrary?ReturnId=${data.id}"> return </a> </c:otherwise>
      
		</c:choose> 
	
	</td>
	
	 </tr>
	 </c:forEach>
     </table>
    
     </div>
</body>
</html>