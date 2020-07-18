<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MySchool - Login Page</title>
</head>
<body>
<h1 style="background-color:DodgerBlue;text-align:center">MySchool - Login</h1>
<h3>Please Login here</h3>
<form:form action="/myschool/login" method="post">

Admission Number <input type="text" name="admnnumber"/><br/>
Password <input type="text" name="password" /><br/>

<%--     <form:label path="admnnumber">Admission Number</form:label>
    <form:input path="admnnumber" />
    <br><br>
    <form:label path="password">Password</form:label>
    <form:input path="password" /> --%>
    <br><br>
<input type="submit" value="Login" />
</form:form>




</body>
</html>