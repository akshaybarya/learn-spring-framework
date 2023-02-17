package com.in28minutes.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Eliminate verbosity in creating Java Beans
//Public accessor methods, constructor
//equals, hashcode and toString are automatically created.
//Released in JDK 16.

record Person (String name, int age) {};

record Address (String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "AkSHaY";
	}
	
	@Bean
	public int age() {
		return 15;
	}
	
	@Bean
	public Person person() {
		return new Person(name(), age());
	}
	
	@Bean
	public Address address() {
		return new Address("5/k", "Mungaoli");
	}
	
//	If you want to customize the name of bean you can pass @Bean(name = "address2")
//	and Now your bean would be accessible using the variable name address2
}