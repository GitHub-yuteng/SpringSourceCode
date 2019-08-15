package com.atguigu.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atguigu.service.HelloService;

@Controller
public class HelloController {
	
	@Autowired
	HelloService helloService;
	
	
	@ResponseBody
	@RequestMapping("/hello")
	public String hello(){
		String hello = helloService.sayHello("tomcat..");
		return hello;
	}
	
	//  /WEB-INF/views/success.jsp
	@RequestMapping("/suc")
	public String success(){
		return "success";
	}
	

}
