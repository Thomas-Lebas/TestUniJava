package com.epsi.TDD.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	
	@GetMapping()
	public String sayHello() {
		return "Hello";
	}
	
	
	@GetMapping("/name/{name}")
	public String sayHello(@PathVariable("name") String name) {
		return "Hello " + name ;
	}

}
