package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // @=> annotation mot clé qui import une configuration
public class DemoController {
	@GetMapping("home")
	public String welcome(@RequestParam(required = false,defaultValue = "admin") String nom)
	{
		return "welcome "+nom;
	}
	@GetMapping("/")
	public String hello()
	{
		return "hello to home page";
	}
	
	
}
