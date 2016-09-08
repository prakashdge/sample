package com.hack.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/admin")
public class AdminServices {
	
	private static final Logger log = LoggerFactory.getLogger(AdminServices.class);

	@RequestMapping("/all")
	public String getUsers(){
		log.info(">>> users method");
		
		log.info(">>> users method");
		return "all users from Admin screen";
		
	}
	
	@RequestMapping("/{id}")
	public String getUser(@PathVariable String id){
		log.info(">>> getUser method");
		
		log.info(">>> getUser method");
		return "user from admin screen:" + id;
	}
	
	@RequestMapping("/from/{from}/to/{to}")
	public String getUserbetween(@PathVariable String from, @PathVariable String to){
		
		log.info(">>> getUserbetween method");
		
		log.info(">>> getUserbetween method");
		return "user admin screen:" + from + " : "+ to;
	}
}
