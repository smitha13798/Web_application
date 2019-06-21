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
<h2 align="center"><font><strong>Retrieve data from database in jsp</strong></font></h2>
<table align="center" cellpadding="5" cellspacing="5" border="1">
<tr>

</tr>
<tr bgcolor="#A52A2A">
<td>employee id</td>
<td>employee name </td>
<td>product</td>
<td>current project</td>
<td>experience</td>
<td>primary skills</td>
<td>secondary skills</td>
<td>additional skills</td>
</tr>
<%

String driverName ="oracle.jdbc.OracleDriver";
String connectionUrl = "jdbc:oracle:thin:@localhost:1521:xe";

String username = "system";
String password = "theme123";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
String sql= "select * from employee ";
try{

connection = DriverManager.getConnection(connectionUrl, username, password);

if(connection!=null)
{
statement=connection.createStatement();

resultSet=statement.executeQuery(sql);
while(resultSet.next()){
	
	
	%>
	<tr bgcolor="#DEB887">

	<td><%=resultSet.getInt("EID") %></td>
	<td><%=resultSet.getString("ENAME") %></td>
	<td><%=resultSet.getString("PRODUCT") %></td>
	<td><%=resultSet.getString("CPROJECT") %></td>
    <td><%=resultSet.getInt("EXPERIENCE") %></td>
	<td><%=resultSet.getString("PRIMARYSKILLS") %></td>
	<td><%=resultSet.getString("SECONDARYSKILLS") %></td>
	<td><%=resultSet.getString("ADDITIONALSKILLS") %></td>


	</tr>
	
	
	<%
}
}
}
catch(Exception e)
{
e.printStackTrace();	
}
%>




</table>
</div>
</body>
</html>