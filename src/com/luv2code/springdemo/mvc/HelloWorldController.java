package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
		//controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showform() {
			return "helloworld-form";
	}
		//controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	@RequestMapping("/processFormVersionTwo")
	public String letsShoudDude(HttpServletRequest request, Model model) {
		//read the request parameter from the HTML form 
		String theName = request.getParameter("studentName");
		//convert the data to caps
		theName=theName.toUpperCase();
		//create the message
		String result = "YO!!!!!"+ theName;
		//add message to the model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
