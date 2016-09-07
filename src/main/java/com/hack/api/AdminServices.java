package com.hack.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminServices {
	@RequestMapping("/all")
	public String getUsers(){
		return "all users from Admin screen";
	}
	
	@RequestMapping("/{id}")
	public String getUser(@PathVariable String id){
		return "user from admin screen:" + id;
	}
	
	@RequestMapping("/from/{from}/to/{to}")
	public String getUserbetween(@PathVariable String from, @PathVariable String to){
		return "user admin screen:" + from + " : "+ to;
	}
}
