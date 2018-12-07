package com.example.springBootDemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springBootDemo.domain.User;

/**
 * @description 
 * @author ShuJinJing
 * @time 2018年12月6日 下午5:02:28 
 */
@RestController
public class HelloWordlController {
	@RequestMapping("/hello")
	public String index() {
		System.out.println(">>>>>>>>>>:测试");
		return "Hello World";

	}

	@RequestMapping("/user")
	public User getUser() {
		User user = new User();
		user.setAge(2);
		user.setName("lily");
		return user;
	}

}
