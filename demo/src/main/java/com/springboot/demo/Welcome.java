package com.springboot.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Welcome {
	@GetMapping("/")
	public static String hello() {
		return "hello world";
	}
	@GetMapping("/hello")
	public static String welcome(@RequestParam("name") String myName) {
		return "Hello"+myName;
	}
	
}
