package com.test.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
@EnableWebMvc
public class Controller1 {
	
	@PostMapping("/test/one") 
	public @ResponseBody String myMethod(@RequestBody String String,HttpServletRequest request, HttpServletResponse response) {
		System.out.println("myMethod called");
		return "Passing values is :"+String;
	}

}
