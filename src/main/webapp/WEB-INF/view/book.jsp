<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>
<head>
<title>hello</title>
</head>
<body>
	<table>
		<tr>
			<td>${book.id}</td>
			<td>${book.reader}</td>
			<td>${book.isbn}</td>
			<td>${book.title}</td>
			<td>${book.author}</td>
			<td>${book.description}</td>
		</tr>
	</table>
</body>
</html>