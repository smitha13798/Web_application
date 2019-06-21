package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import model.Employee;

public class ResourcesDAO {

	/*
	EID              NOT NULL NUMBER(10)   
	ENAME                     VARCHAR2(20) 
	PRODUCT                   VARCHAR2(20) 
	CPROJECT                  VARCHAR2(20) 
	EXPERIENCE                NUMBER(20)   
	PRIMARYSKILLS             VARCHAR2(20) 
	SECONDARYSKILLS           VARCHAR2(20) 
	ADDITIONALSKILLS          VARCHAR2(20) 
	*/
	public List<Employee> getResourcesByYearOfExp(int floor,int ceil)
	{
		List employees=new LinkedList();
		try {
		
		Integer eid=0;
		String ename=null;
		String product=null;
		String cproject=null;
		Integer experience=0;
		String primaryskills=null;
		String secondaryskills=null;
		String additionalskills=null;
		ResultSet rs=null;
		String sql="select * from employee where experience between ? and ?";
		//get connection to db
		//code to create statement and execute
		
		Connection con=MyDBConnectionUtil.getCon();
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, floor);
		ps.setInt(2, ceil);
		rs=ps.executeQuery();
		
	
		
		while(rs.next())
		{
			System.out.println(rs);
			 eid=rs.getInt(1);
			 ename=rs.getString(2);
			 product=rs.getString(3);
			 cproject=rs.getString(4);
			 experience=rs.getInt(5);
			 primaryskills=rs.getString(6);
			 secondaryskills=rs.getString(7);
			 additionalskills=rs.getString(8);
			Employee employee=new Employee(eid,ename,product,cproject,experience,primaryskills,secondaryskills,additionalskills);
			employees.add(employee);
			System.out.println(employees);
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employees;
	}
	
	public List<Employee> getResourcesByProductName(String p)
	{
		List employees=new LinkedList();
		try {
		
		Integer eid=0;
		String ename=null;
		String product=null;
		String cproject=null;
		Integer experience=0;
		String primaryskills=null;
		String secondaryskills=null;
		String additionalskills=null;
		ResultSet rs=null;
		String sql="select * from employee where Product=?";
		//get connection to db
		//code to create statement and execute
		
		Connection con=MyDBConnectionUtil.getCon();
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,p);
	//	ps.setInt(2, ceil);
		rs=ps.executeQuery();
		
	
		
		while(rs.next())
		{
			System.out.println(rs);
			 eid=rs.getInt(1);
			 ename=rs.getString(2);
			 product=rs.getString(3);
			 cproject=rs.getString(4);
			 experience=rs.getInt(5);
			 primaryskills=rs.getString(6);
			 secondaryskills=rs.getString(7);
			 additionalskills=rs.getString(8);
			Employee employee=new Employee(eid,ename,product,cproject,experience,primaryskills,secondaryskills,additionalskills);
			employees.add(employee);
			System.out.println(employees);
		}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employees;
	}
	
	
}
