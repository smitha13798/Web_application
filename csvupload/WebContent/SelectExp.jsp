<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
body {
  background-color: lightblue;
}
</style>
</head>

<body>
 <div align="center" class="body" >  
<form action="RetriveExp" method="post" >
<h1>Experience</h1>
<p>select the employeeexperience to retrive the employee details</p>
<select name="exp">
<option value="select yrs of experience"></option>
 <option value="1">0-1 year</option>
 <option value="2">1-2 years</option>
  <option value="3">2-3 years</option>
  <option value="4">3-4 year</option>
  <option value="5">4-5 year</option>
  </select><br><br><br>
<input type=submit value="getDetails"/>

  </form>
</div>
</body>
</html>