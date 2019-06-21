<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
<%@page import="model.Employee,java.util.*" %>


<h2 align="center"><font><strong>Retrieve data from database in jsp</strong></font></h2>
<table align="center" cellpadding="5" cellspacing="5" border="1">

<tr bgcolor="#A52A2A">
<td><b>EMPLOYEE ID </b></td>
<td><b>EMPLOYEE NAME</b></td>
<td><b>PRODUCT</b></td>
<td><b>CURRENT PROJECT/b></td>
<td><b>EXPERIENCE</b></td>
<td><b>PRIMARY SKILLS</b></td>
<td><b>SECONDARY SKILLS</b></td>
<td><b>ADDITIONAL SKILLS</b></td>
</tr>

<%


List<Employee> emps=(List)request.getAttribute("employees");                                                                                                                                                                                             

Iterator item=emps.iterator();
while(item.hasNext())
{
Employee e=(Employee)item.next();
%>
<tr bgcolor="#DEB887">
<td>
<%=e.getEid()%></td>
<td><%=e.getEname()%></td> 
<td><%=e.getProduct()%></td>   
<td><%=e.getCproject()%></td>   
<td><%=e.getExperience()%></td>   
<td><%=e.getPrimaryskills()%></td>   
<td><%=e.getSecondaryskills()%></td>   
<td><%=e.getAdditionalskills()%></td>                                      
</tr>
<%
}
%>

</table>
 
</div>
</body>
</html>