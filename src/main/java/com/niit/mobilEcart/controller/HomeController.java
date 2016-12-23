package com.niit.mobilEcart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{
	@RequestMapping("/")
	public String getLanding()
	{
		System.out.println("Landing Page is Loading....");
		return "index";
	}
	@RequestMapping("/home")
	public String getHome()
	{
		System.out.println("Home Page is Loading....");
		return "home";
	}
}
