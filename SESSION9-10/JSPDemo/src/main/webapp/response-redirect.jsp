<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>GET HEADER DEMO</title>
</head>

<body>
<%
        String office = request.getParameter("office");
        if (office != null)
                out.println("value of Office obtained :" + office + " <br>");
        else
                out.println("No value of Office found <br>");
%>

</body>

</html>