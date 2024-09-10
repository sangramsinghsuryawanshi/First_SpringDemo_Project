package com.project.FirstProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ControllerDemo 
{
	@RequestMapping("/")
	public String isHome()
	{
		return "home.html";
	}
	@RequestMapping("data")
	public String isSecond(@RequestParam int id,@RequestParam String name,@RequestParam String email)
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		return "second.html";
	}
	@RequestMapping("/jsp")
	public String isDone()
	{
		return "notRendering.jsp";
	}
	@RequestMapping("/jsp1")
	public String isJsp(@RequestParam int id, @RequestParam String name, @RequestParam String email)
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		return "second.html";
	}
}
