package com.todos.rest.basic;

import java.lang.String;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class BasicAuthenticationController {
	
	//get
	//uri - /hello-world
	//method - "hello world"
	//@RequestMapping(method = RequestMethod.GET, path = "/hello-world")

	
	@GetMapping(path = "/basicauth")
	public AuthenticationBean helloWorldBean() {
		//throw new RuntimeException("Some error has happen!");
		return new AuthenticationBean("You are authenticated!");
	}


}
