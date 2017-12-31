package com.example.controller;

import com.huc.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ComponentScan("com.example.config")
//@ImportResource(value = {"classpath:dubbo/dubbo-provider.xml"})
public class RestApplication {


	@Autowired
	private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);

	}

	@RequestMapping("/")
	public String test(){
		System.out.println("-------");
		System.out.println(userService.getList());
		return "asdasd"+userService.getList();
	}



}
