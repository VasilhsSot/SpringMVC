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
	<form:form modelAttribute="book" method="POST" action="addBook.htm">
		<h2>
			Enter the Book Details
		</h2>

		<table width="100%" height="150" align="center" border="0">
			<tr>
				<td width="50%" align=right>ISBN</td>
				<td width="50%" align="left">
						<form:input path="ISBN" size="30" />
				</td>
			</tr>
			<tr>
				<td width="50%" align="right">Title</td>
				<td width="50%" align="left">
						<form:input path="bookName" size="30" />
				</td>
			</tr>
			<tr>
				<td width="50%" align="right">Name of the Author</td>
				<td width="50%" align="left">
						<form:input path="author" size="30" />
				</td>
			</tr>
			<tr>
				<td width="50%" align="right">Size</td>
				<td width="50%" align="left">
					<form:select path="size">
						<form:options items="${size}" />  
					</form:select>
				</td>
    		</tr>
			<tr>
				<td width="50%" align="right">Description</td>
				<td width="50%" align="left">
					<form:input path="description"	size="30" />
				</td>
			</tr>
			<tr>
				<td width="50%" align="right">Publication</td>
				<td width="50%" align="left">
					<form:input path="publication"	size="30" />
				</td>
			</tr>
			<tr>
				<td width="50%" align="right">Price</td>
				<td width="50%" align="left">
					<form:input path="price"	size="10" />
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