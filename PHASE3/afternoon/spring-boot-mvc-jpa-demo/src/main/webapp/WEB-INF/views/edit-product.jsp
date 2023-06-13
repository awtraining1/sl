<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div align="center">
	Edit Product ${product.ID} below:<br>

	<form:form action="edit-product" method="post" modelAttribute="product">

		<form:input path="ID" value="${product.ID}" hidden="true"/>
		
		<form:label path="name" >Product name:</form:label>
		<form:input path="name" value="${product.name}"/>
		<br />
		<form:label path="price">Product Price:</form:label>
		<form:input path="price" value="${product.price}"/>
		<br />
		
		<!--<form:input path="dateAdded" value="${product.dateAdded}" hidden="true"/>-->

		<form:button>Save Product</form:button>

	</form:form>