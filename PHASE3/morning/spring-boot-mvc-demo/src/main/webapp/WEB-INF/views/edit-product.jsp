<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Registration Form</title>
</head>
<body>
	<div align="center">
			Edit Product 	${product.ID} <br>	<br>	
		
			<form:form action="edit-product" method="post"
				modelAttribute="product">
				<form:input path="ID" value="${product.ID}" type="hidden"/>
				
				<form:label path="name">Product name:</form:label>
				<form:input path="name" value="${product.name}" />
				<br />
				<form:label path="price">Product Price:</form:label>
				<form:input path="price" value="${product.price}" />
				<br />
				<form:input path="ID" value="${product.dateAdded}" type="hidden"/>

				<form:button>Save Product</form:button>

			</form:form>
		