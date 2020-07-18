<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MySchool - SignUp Page</title>
</head>
<body>
<h1 style="background-color:DodgerBlue;text-align:center">MySchool - SignUp</h1>
<h3>Please signup here</h3>
<form:form action="/myschool/signup" method="post" modelAttribute="students">
    <form:label path="admnnumber">Admission Number</form:label>
    <form:input path="admnnumber" />
    <br><br>
    <form:label path="name">Name</form:label>
    <form:input path="name" />
    <br><br>
    <form:label path="gender">Gender</form:label>
    <form:input path="gender" />
    <br><br>
    <form:label path="address">Address</form:label>
    <form:input path="address" />
    <br><br>
    <form:label path="mailid">Mail Id</form:label>
    <form:input path="mailid" />
    <br><br>
    <form:label path="password">Password</form:label>
    <form:input path="password" />
    <br><br>
<input type="submit" value="Register" />
</form:form>
</body>
</html>