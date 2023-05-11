<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<body>
<h2>hi duniya!</h2>
    <%
    String name=(String)request.getAttribute("name");
    Integer id=(Integer)request.getAttribute("id");
    List<String> friends=(List<String>)request.getAttribute("f");
    %>
    <h3>hi! my name is <%=name%> </h3>
    <h3>my robot-id is <%=id%> </h3>
    <h3>here is my list of robot-friends that I have</h3>
    <% for(String s:friends){ %>
       <h3><%=s%></h3>

    <%}%>
</body>
</html>
