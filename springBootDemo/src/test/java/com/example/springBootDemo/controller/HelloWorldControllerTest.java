package com.example.springBootDemo.controller;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * @description 
 * @author ShuJinJing
 * @time 2018年12月6日 下午5:14:58 
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloWorldControllerTest {
	private MockMvc mvc;

	@Before
	public void setUp() {
		MockMvcBuilders.standaloneSetup(new HelloWordlController()).build();
	}
}
