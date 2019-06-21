package controller;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpSession;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.reflect.ReflectionFactory.GetReflectionFactoryAction;
import dao.ResourcesDAO;
import model.Employee;
/**
 * Servlet implementation class Retrieve
 */
@WebServlet("/RetrivePro")
public class RetriveProdServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String product = request.getParameter("pro");
		  ResourcesDAO resource=new ResourcesDAO();
		  List<Employee> employees=null;
		  HttpSession session=request.getSession();
		
		  int 	  ProductName=0;
		  ProductName  = Integer.parseInt(product);
		 
	
		   
		   if( ProductName==1)
		   {
		 
		   employees=resource.getResourcesByProductName("themepro");
		   }
		   
		   
		   else if(ProductName==2)
		   {
		 
		   employees=resource.getResourcesByProductName("finastra");
		   }
		   
		 
		  
		   request.setAttribute("employees", employees);
		   RequestDispatcher rd=request.getRequestDispatcher("DisplayEmployeesBasedonProductDetails.jsp");
		   rd.forward(request, response);
	

	

	}
}

