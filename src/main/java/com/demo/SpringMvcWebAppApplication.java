package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringMvcWebAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringMvcWebAppApplication.class, args);
		System.out.println("----------------"+ctx.getBeanDefinitionCount()+"----------------");
//		for(String s : ctx.getBeanDefinitionNames()) {
//			System.out.println(s);
//		}
	}

}
