<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 4 MVC - HelloWorld Index Page</title>
</head>
<body>
 
	<center>
	

		<table border="1">	
			<tr>
				<td> An </td>
				<td>Luna</td>
				<td>Apa rece </td>
				<td>Apa calda </td>
			</tr>
			
			<c:forEach var="record" items="${records}">
				<tr>
					<td>${record.an}</td>
					<td> ${record.luna}</td>
					<td> ${record.apaRece}</td>
					<td> ${record.apaCalda}</td>
				</tr>
			</c:forEach>		
		</table>	
		
		
	</center>
</body>
</html>