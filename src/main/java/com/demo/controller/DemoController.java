package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.DemoService;

@RestController
@RequestMapping("demo")
public class DemoController {
	
	@Autowired
	private DemoService demoService;
	
	@RequestMapping(value="/hello",method= RequestMethod.GET)
	public String demo() {
		demoService.insertProduct();
		return "Hello";
	}
	
}
