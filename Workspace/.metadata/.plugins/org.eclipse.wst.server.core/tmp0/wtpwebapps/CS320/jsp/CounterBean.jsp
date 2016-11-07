<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<jsp:useBean id="CounterBean" class="cs320.bean.PageCounterBean" scope= "application" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>This page has been visited: <jsp:getProperty name ="CounterBean" property="count" /></h1>

<h2>The Cookie is: ${cookie.JSESSIONID.value} </h2>

</body>
</html>