package com.hack.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserServices {

	@RequestMapping("/all")
	public String getUsers(){
		return "all users";
	}
	
	@RequestMapping("/{id}")
	public String getUser(@PathVariable String id){
		return "user :" + id;
	}
	
	@RequestMapping("/from/{from}/to/{to}")
	public String getUserbetween(@PathVariable String from, @PathVariable String to){
		return "user :" + from + " : "+ to;
	}
	
}
