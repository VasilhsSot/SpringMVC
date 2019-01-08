<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Book List</title>
</head>
<body>
	<center>
		<img alt="bookshelf" src="images/img1.png" height="180"
			width="350">
			<br><br />
	
	<jstl:if test="${not empty book_list }">
		<h1 align="center">
			<font color="green">Book List of ${author_name} </font>
		</h1>
		<table align="center" border="1">
			<tr>
				<th>Title</th>
				<th>ISBN</th>
				<th>Publication</th>
				<th>Price</th>
				<th>Description</th>
			</tr>
			<jstl:forEach var="book_data" items="${book_list}" varStatus="st">
				<tr>
					<td><jstl:out value="${ book_data.bookName }"></jstl:out></td>
					<td><jstl:out value="${ book_data.ISBN }"></jstl:out></td>
					<td><jstl:out value="${ book_data.publication }"></jstl:out></td>
					<td><jstl:out value="${ book_data.price }"></jstl:out></td>
					<td><jstl:out value="${ book_data.description }"></jstl:out></td>
				</tr>
			</jstl:forEach>

		</table>
	</jstl:if>
	<font color="green" size="10">
	<jstl:if test="${empty book_list }"><jstl:out value="No Book Found"></jstl:out></jstl:if>
	</font>
	</center>
</body>
</html>