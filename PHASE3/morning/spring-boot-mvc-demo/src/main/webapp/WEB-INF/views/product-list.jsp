<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	   
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
	
<c:forEach var="product" items="${productList}">   
  ${product.ID}, ${product.name}, ${product.price}, ${product.dateAdded}<br>  
</c:forEach> 