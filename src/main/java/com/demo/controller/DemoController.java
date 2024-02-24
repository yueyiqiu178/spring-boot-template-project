package com.demo.controller;

import com.demo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.DemoService;

import java.util.Collection;

@RestController
@RequestMapping("demo")
public class DemoController {
	
	@Autowired
	private DemoService demoService;
	
	@RequestMapping(value="/hello",method= RequestMethod.GET)
	public Collection<Product> demo() {
		//demoService.insertProduct();
		demoService.findAllProduct();

		return demoService.findProductPriceGrt100();
	}
	
}
