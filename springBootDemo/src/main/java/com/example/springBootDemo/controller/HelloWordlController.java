package com.example.springBootDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description 
 * @author ShuJinJing
 * @time 2018年12月6日 下午5:02:28 
 */
@RestController
public class HelloWordlController {
	@RequestMapping("hello")
	public String index() {
		return "Hello World";

	}
}
