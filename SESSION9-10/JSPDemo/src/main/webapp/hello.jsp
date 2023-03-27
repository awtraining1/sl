

<%@page import="java.util.Calendar"%>

<hr><br>
VARIABLE DECLARATION TAG; Declared variables will become member variables of the generated Servlet<br>
<%! int data=100; %>

<br>JSP EXPRESSIONS: VARIABLE OUTPUT TAG<br>
data is <%= data %>
<br><%= new String("Today is Sunday") %>
<br><br>
Time now is : <b> <%= Calendar.getInstance().getTime()%>  </b>

<br>JSP SCRIPTLET: Use for any Java code; Anything here will go inside service() method<br>
<% out.println("Hello World"); %>