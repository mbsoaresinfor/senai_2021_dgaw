package com.aula.rest;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	
	@RequestMapping(value = "/hello", method = RequestMethod.GET, produces="application/json")	 
	  public String hello() {
		 return "Ola mundo Rest";
	 }
	 
	 @RequestMapping(value = "/hello2", method = RequestMethod.GET, produces="application/json")	 
	  public String hello2() {
		 return "Ola mundo Rest 2";
	 }
}
