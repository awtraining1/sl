<%@page import="java.math.BigDecimal"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<html>
<head>
<title>Database Demo</title>
</head>


<body>

	<sql:setDataSource var="ecommerce" driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost/ecommerce" user="root" password="rootroot" />

	<sql:query dataSource="${ecommerce}" sql="SELECT * FROM EPRODUCT"
		var="result" />

	<table border=1>
		<tr>
			<th>ID</th>
			<th>Name</th>
			<th>Price</th>
			<th>Date Added</th>

		</tr>
		<c:forEach var="row" items="${result.rows}">
			<tr>
				<td><c:out value="${row.id}" /></td>
				<td><c:out value="${row.name}" /></td>
				<td><c:out value="${row.price}" /></td>
				<td><c:out value="${row.date_added}" /></td>
			</tr>
		</c:forEach>
	</table>


</body>

</body>



</html>