package com.code.action;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestAction {
	@GetMapping("/hello")
	public String hello(){
		return "hello DearN";
	}
}
