package com.cts123;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
	
	public String hello() {
		return "helo";
	}
	
	public String login() {
		
		return "login";
	}
	
	public String login2() {
		System.out.println("world hello");
		return "hello";
	}

}
