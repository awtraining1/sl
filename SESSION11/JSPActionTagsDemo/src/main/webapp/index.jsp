<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Action Tag Demo</title>
</head>

<body>

Usage of useBean tag<br>
<jsp:useBean id="productBean1" class="com.ecommerce.ProductBean" 
scope="session"></jsp:useBean>

        <jsp:setProperty property="productId" name="productBean1" value="18791"/>
        <jsp:setProperty property="productName" name="productBean1" 
value="Optical Wireless Mouse"/>
        <jsp:setProperty property="price" name="productBean1" value="600.00"/>
        
<a href="showbean.jsp">Access bean properties from another page</a><br>



<a href="forward.jsp">Click here to go forward.jsp </a><br><br>


<jsp:include page="footer.jsp" ></jsp:include>


</body>
</html>