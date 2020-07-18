<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table {
  font-family: arial, sans-serif;
  border-collapse: collapse;
  width: 100%;
}

td, th {
  border: 1px solid #dddddd;
  text-align: left;
  padding: 8px;
}

tr:nth-child(even) {
  background-color: #dddddd;
}
</style>
</head>
<body>
<h1 style="background-color:DodgerBlue;text-align:center">MySchool - Welcome ${name} You have logged in successfully</h1>
<br>
<br>
<table>
<tr>
<th>Admission Number</th>
<th>Name</th>
<th>Gender</th>
<th>Address</th>
<th>Mail ID</th>
</tr>
<tr>
<td>${admnnumber}</td>
<td>${name}</td>
<td>${gender}</td>
<td>${address}</td>
<td>${mailid}</td>
</tr>
</table>
<br>
<br>
<h3><a href="/myschool/logout">Logout</a></h3>
</body>
</html>