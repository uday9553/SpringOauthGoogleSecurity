package com.uday.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController 
{
	@RequestMapping("/")
	public String home()
	{
		return "Hello-World";
	}
	
	@RequestMapping("/login")
	public String loginPage()
	{
		return "loginSuccessFull";
	}
	
	
}