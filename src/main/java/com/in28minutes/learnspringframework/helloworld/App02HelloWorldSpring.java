package com.in28minutes.learnspringframework.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {

	public static void main(String[] args) throws Exception {
	//  1: Launch a Spring Context
		
//		TRY WITH RESOURCES
		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
		
		//	2: Configure the things that we want Spring to manage - 
			// HelloWorldConfiguration - @Configuration
			//name - @Bean
			
			//3: Retrieving Beans managed by Spring
			
			//We are using name to retrieve a bean
			System.out.println(context.getBean("name"));
			
			System.out.println(context.getBean("age"));
			
			System.out.println(context.getBean("person"));
			
			System.out.println(context.getBean("address"));
			System.out.println(context.getBean("person2MethodCall"));
			System.out.println(context.getBean("person3Parameters"));
			
			//Using type to retrieve a bean
			System.out.println(context.getBean(Address.class));
			
			System.out.println(context.getBean("person5Qualifier"));
			//List all the beans managed by spring framework
	//		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);;
		
		}
		catch (Exception e) {
			
		} 
	}

}