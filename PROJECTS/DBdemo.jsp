SESSION 11 folder now has a DBdemo.jsp file that successfully connects to the ecommerce databse and fetches the product  table data.

Sample of how to add the action (link) so that when a desired flight is selected it will take customer to another jsp (flight-details.jsp),
along with the id of the flight(using the url rewriting technique).

In search-details.jsp
---------------------

<sql:setDataSource
    var="dataSource"
    driver="com.mysql.jdbc.Driver"
    url="jdbc:mysql://localhost/ecommerce"
    user="username"
    password="password"
/>

<sql:query dataSource="${dataSource}" var="result">
    SELECT * FROM eproduct
</sql:query>

<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
            <th>Action</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="row" items="${result.rows}">
            <tr>
                <td>${row.id}</td>
                <td>${row.name}</td>
                <td>${row.price}</td>
                <td>
                    <a href="flight-details.jsp?id=${row.id}">SELECT THIS FLIGHT</a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>


In the flight-details.jsp, use reguest.getParameter("id") to get the id of the selected flight.
Use this id to fetch the flight details and display it for booking/payment.
