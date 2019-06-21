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
 * Servlet implementation class Retrive
 */
@WebServlet("/RetriveExp")
public class RetriveExpServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String experience = request.getParameter("exp");
		  ResourcesDAO resource=new ResourcesDAO();
		  List<Employee> employees=null;
		  HttpSession session=request.getSession();
		
		  
		  int yearsOfExp=0;
		 
		   yearsOfExp= Integer.parseInt(experience);
		   
		   if(yearsOfExp==1)
		   {
		 
		   employees=resource.getResourcesByYearOfExp(0, 1);
		   }
		   
		   
		   else if(yearsOfExp==2)
		   {
		 
		   employees=resource.getResourcesByYearOfExp(1, 2);
		   }
		   
		   else if(yearsOfExp==3)
		   {
		 
		   employees=resource.getResourcesByYearOfExp(2, 3);
		   }
		   
		   else if(yearsOfExp==4)
		   {
		 
		   employees=resource.getResourcesByYearOfExp(3, 4);
		   }
		   
		   else if(yearsOfExp==5)
		   {
		 
		   employees=resource.getResourcesByYearOfExp(4, 5);
		   }
		  
		   request.setAttribute("employees", employees);
		   RequestDispatcher rd=request.getRequestDispatcher("DisplayEmployeesBasedonExp.jsp");
		   rd.forward(request, response);
	

	

	}
}
