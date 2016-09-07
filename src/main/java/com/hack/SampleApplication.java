package com.hack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.hack")
public class SampleApplication {

	public static void main(String[] args) {
		System.out.println("====================");
		for (String string : args) {
			System.out.println("Args 	:" + string);
		}
		System.out.println("====================");
		SpringApplication.run(SampleApplication.class, args);
	}
	
}
