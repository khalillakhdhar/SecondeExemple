package com.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculeController {

	@PostMapping("/somme")
	public String somme(@RequestParam int a,@RequestParam int b)
	{
		int somme=a+b;
		return "la somme des deux entiers est: "+somme;
	}
	@PostMapping("produit")
	public String produit(@RequestParam int a,@RequestParam int b)
	{
		int produit=a*b;
		return "le produit des deux entiers est: "+produit;
	}
	
	
}
