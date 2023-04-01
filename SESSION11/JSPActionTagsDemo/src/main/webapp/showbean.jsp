<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
Display Bean object <br>
<body>

	<jsp:useBean id="productBean1"  class="com.ecommerce.ProductBean" 
scope="session">>
	</jsp:useBean>
	
	
	Product Id:
	<jsp:getProperty name="productBean1" property="productId" />
	<br> Product Name:
	<jsp:getProperty name="productBean1" property="productName" />
	<br> Product Price:
	<jsp:getProperty name="productBean1" property="price" />
	<br>

</body>

</html>