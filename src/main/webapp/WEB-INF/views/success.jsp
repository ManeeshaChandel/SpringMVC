<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<body>
   <h3>${Header}</h3>
   <p>${Desc}</p>
   <h1 style="color:green">${msg}</h1>
   <hr>
   <h1>Welcome, ${user.userName}</h1>
   <h1>Your email address is ${user.email}</h1>
   <h1>Your password is ${user.password}</h1>
</body>
</html>