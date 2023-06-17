<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div align="center">

	<form:form action="add-product" method="post" modelAttribute="product">

		<form:label path="name">Product name:</form:label>
		<form:input path="name" />
		<br />
		<form:label path="price">Product Price:</form:label>
		<form:input path="price" />
		<br />

		<form:button>Add Product</form:button>

	</form:form>