package com.smarty.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping("/home")
	public String home() {
		System.out.println("Home page loading");
		return "home";
	}
	
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("About page loading");
		return "about";
	}
	
	@RequestMapping("/services")
	public String services() {
		System.out.println("Services page loading");
		return "services";
	}
}
