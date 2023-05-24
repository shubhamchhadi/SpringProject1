/*
 
 ADD LIBRARY IN [ C:\Users\SHUBHAM\OneDrive\Documents\NetBeansProjects\JavaApplication1\jar\spring jar\jar_files.zip\jar_files ] 

	The type TestController must IMPLEMENTS the inherited ABSTRACT method  Controller.handleRequest
 	******* CONTROLLER is INTERFACE *******
 */
package org.nlt.controller;

//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class TestController implements Controller
{
 //DispatcherServlet
@Override
	public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception 
	{
		Map m = new HashMap();
		//String name = req.getParameter("name");
		
		m.put("msg", "Hello NLT Good Morning");
		m.put("msg2", "Hello NLT Good Evening");
		
		 ArrayList arr = new ArrayList();
		 arr.add("Raju");
		 arr.add("Kaju");
		 arr.add("Battasha");
		 
		 m.put("PersonList", arr);
		 return new ModelAndView("index",m);
	}
	
}
