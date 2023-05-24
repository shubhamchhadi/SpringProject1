package org.nlt.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.taglibs.standard.lang.jstl.NamedValue;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TestController2 implements Controller 
{
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception 
	{
		
		Map m = new HashMap();
		
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String phone = req.getParameter("phone");
		
			// for hold data on server means [ form backup ]
		m.put("NameValue", name);
		m.put("AgeValue", age);
		m.put("PhoneValue", phone);
			// form backup close
		
		if (name.isEmpty())
		{
			m.put("NameError", "Please Enter a Name");
		}
		else if (age.isEmpty())
		{
			m.put("AgeError", "Please Enter a Age");
		}
		else if (phone.isEmpty())
		{
			m.put("PhoneError", "Please Enter a Phone");
		}
		else
		{
		/*	
						
			 try
		        {
				 					 
		            Class.forName("com.mysql.jdbc.Driver");
		            System.out.println("Driver Loaded");

		            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nlt3", "root", "");
		            System.out.println("Connection Established");

		            Statement smt = con.createStatement();
		            smt.execute("Insert into students6(name,age,phone,status) values ('"+name+"',"+age+",'"+phone+"',1)");

		            smt.close();
		            con.close();
		           
		        }
		        catch (Exception e)
		        {
		        	System.out.println(e);
		        }*/
					
			m.put("SuccessMessage", "Your Record Submitted Successfully");
			}
		
		
			// return on index page
		return new ModelAndView("index",m);
		
	}

}
