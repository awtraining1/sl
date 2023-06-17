<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<table border=1>
	<tr>
		<td>ID
		<td>NAME
		<td>PRICE
		<td>DATE ADDED
		<td>ACTIONS
	</tr>
	<c:forEach var="product" items="${productList}">
		<tr>
			<td>${product.ID}
			<td>${product.name}
			<td>${product.price}
			<td>${product.dateAdded}
			<td><a href="edit-product?id=${product.ID}">EDIT </a>
			 <a	href="delete-product?id=${product.ID}">DELETE </a>
		</tr>
	</c:forEach>

</table>

<a href="add-product">ADD A NEW PRODUCT</a>