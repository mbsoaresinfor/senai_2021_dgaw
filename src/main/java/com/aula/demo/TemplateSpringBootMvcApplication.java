package com.aula.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class TemplateSpringBootMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemplateSpringBootMvcApplication.class, args);
	}

	
	 @RequestMapping(value = "/hello", method = RequestMethod.GET, produces="application/json")	 
	  public String hello() {
		 return "Ola mundo Rest";
	 }
	 
	 @RequestMapping(value = "/hello2", method = RequestMethod.GET, produces="application/json")	 
	  public String hello2() {
		 return "Ola mundo Rest 2";
	 }
}
