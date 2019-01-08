<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Contact Form</title>
</head>
<body>
<center>
		<img alt="bookshelf" src="images/img1.png" height="180" width="350">
		
	<form:form modelAttribute="book" method="POST" action="addBook.htm">
		<h2>
			Enter Book Details
		</h2>

		<table width="100%" height="150" align="center" border="0">
			<tr>
				<td width="50%" align=right>ISBN</td>
				<td width="50%" align="left">
						<form:input path="ISBN" size="30" />
						<font color="red"><form:errors path="ISBN" /></font>
				</td>
			</tr>
			<tr>
				<td width="50%" align="right">Title</td>
				<td width="50%" align="left">
						<form:input path="bookName" size="30" />
						<font color="red"><form:errors path="bookName" /></font>
				</td>
			</tr>
			<tr>
				<td width="50%" align="right">Name of the Author</td>
				<td width="50%" align="left">
						<form:input path="author" size="30" />
						<font color="red"><form:errors path="author" /></font>
				</td>
			</tr>
			<tr>
				<td width="50%" align="right">Description</td>
				<td width="50%" align="left">
					<form:input path="description"	size="30" />
					<font color="red"><form:errors path="description" /></font>
				</td>
			</tr>
			<tr>
				<td width="50%" align="right">Publication</td>
				<td width="50%" align="left">
					<form:input path="publication"	size="30" />
					<font color="red"><form:errors path="publication" /></font>
				</td>
			</tr>
			<tr>
				<td width="50%" align="right">Price</td>
				<td width="50%" align="left">
					<form:input path="price"	size="10" />
					<font color="red"><form:errors path="price" /></font>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"	value="Add Book"></td>
			</tr>

		</table>
	</form:form>
</center>
</body>
</html>