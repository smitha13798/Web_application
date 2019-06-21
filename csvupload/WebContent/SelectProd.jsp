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
<form action="RetrivePro" method="post" >
<h1>Product</h1>
<p>select the Product Name to retrive the employee details</p>
<select name="pro">
<option value="select product"></option>
 <option value="1">Themepro</option>
 <option value="2">Finestra</option>

  </select><br><br><br>
<input type=submit value="getDetails"/>

  </form>
</div>
</body>
</html>