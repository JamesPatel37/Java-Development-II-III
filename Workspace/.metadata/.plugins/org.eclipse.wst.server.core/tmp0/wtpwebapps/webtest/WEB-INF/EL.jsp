<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
tr{
	align = "center";
}
</style>

</head>
<body>

<table border=2 align="center">
<tr align="center">
	<th colspan=2> Arithmetic Operators <th colspan=2> Relational Operators
<tr align="center">
	<th>Expression	<th>Result	<th>Expression	<th>Result

<tr align="center">
	<td>\${3+2-1}	<td>${3+2-1} 	<td>\${1&lt;2}		<td>${1<2}
	
<tr align="center">
	<td>\${"1"+2}	<td>${"1"+2}	<td>\${"a"&lt;"b"}	<td>${"a"<"b"} 
	 
<tr align="center">
	<td>\${1 + 2*3 + 3/4}	<td>${1 + 2*3 + 3/4}	<td>\${2/3 &gt;= 3/2}	<td>${2/3 >= 3/2} 
	 
<tr align="center">
	<td>\${3%2}		<td>${3%2}  	<td>\${3/4 == 0.75}	<td>${3/4 == 0.75}  
	
<tr align="center">
	<td>\${(8 div 2) mod 3}	<td>${(8 div 2) mod 3}	<td>\${null == "test"}	<td>${null == "test"}
	
	

<tr align="center">
	<th colspan=2> Logical Operators	<th colspan=2><CODE>empty</CODE> Operator
<tr align="center">
	<th>Expression	<th>Result	<th>Expression	<th>Result
	
<tr align="center">
	<td>\${(1&lt;2) && (4&lt;3)}	<td>${(1<2) && (4<3)}   <td>\${empty ""}	<td>${empty ""}  
	
<tr align="center">
	<td>\${(1&lt;2) || (4&lt;3)}<td>${(1<2) || (4<3)}  <td>\${empty null}	<td>${empty null} 
	 
<tr align="center">
	<td>\${!(1&lt;2)}	<td>${!(1<2)}	<td>\${empty param.blah}	<td>${empty param.blah}

</table>

</body>
</html>