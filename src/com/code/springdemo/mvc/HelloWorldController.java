package com.code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController 
{
	//Need a controller method to show initial HTML Form
	@RequestMapping("/showForm")
	public String showForm()
	{
		return "helloworld-form";
	}
	
	//Need a controller method to process the HTML Form
	@RequestMapping("/processForm")
	public String processForm()
	{
		return "helloworld";
	}
	
	//New contoller method to read form data and add data to Model
	/*@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model)
	{
		//Read the Request Parameter from HTML Form
		String studentName = request.getParameter("studentName");
		
		//Convert the data to Uppercase
		studentName = studentName.toUpperCase();
		
		//Create the result
		String result = "Yo! "+studentName;
		
		//Add that result to Model
		model.addAttribute("message", result);
		
		return "helloworld";
	}*/
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String studentName, Model model)
	{
		//Convert the data to Uppercase
		studentName = studentName.toUpperCase();
		
		//Create the result
		String result = "Yooo! "+studentName;
		
		//Add that result to Model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
