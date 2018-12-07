package com.example.springBootDemo.configuration;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @description 
 * @author ShuJinJing
 * @time 2018年12月7日 下午4:13:06 
 */
@Configuration
public class WebConfiguration {

	@Bean
	public FilterRegistrationBean testFilterRegistration(){
		return null;
	}
}
