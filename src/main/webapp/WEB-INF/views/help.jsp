<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<%@ page import="java.time.LocalDateTime" %>

<!DOCTYPE html>
<html>
<head><title>Help Page</title></head>
<body>
 <%
   String name=(String)request.getAttribute("name");
    Double version=(Double)request.getAttribute("id");
    LocalDateTime time=(LocalDateTime)request.getAttribute("time");
   %>
<h2>hello! My name is <%=name%> <%=version%> </h2>
<h2>My Local Time now is : <%=time.toString()%> </h2>
<h2>HOW CAN I HELP YOU!</h2>
<hr>

</body>
</html>