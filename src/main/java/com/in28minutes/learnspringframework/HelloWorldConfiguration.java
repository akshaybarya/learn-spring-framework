package com.in28minutes.learnspringframework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

//Eliminate verbosity in creating Java Beans
//Public accessor methods, constructor
//equals, hashcode and toString are automatically created.
//Released in JDK 16.

record Person (String name, int age, Address address) {};

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
		return new Person("Ravi", 23, new Address("69, Hardiya Compound", "Indore"));
	}
	
//	Creating a new bean with relationship with existing bean 
	@Bean
	public Person person2MethodCall() {
		return new Person(name(), age(), address());
	}
	
	@Bean
	public Person person3Parameters(String name, int age, Address address) {
		return new Person(name, age, address);
	}
	
	// If I want to use a Qualifier
	@Bean
	public Person person5Qualifier(String name, int age, @Qualifier("addressQualifier") Address address) {
		return new Person(name, age, address);
	}
	
	@Bean
	public Address address() {
		return new Address("5/k", "Mungaoli");
	}
	
	@Bean
	@Qualifier("addressQualifier")
	public Address address6() {
		return new Address("E-882", "Kota");
	}
	
	@Bean(name = "address3")
	@Primary
	public Address address2() {
		return new Address("69", "Bengaluru");
	}
	
//	If you want to customize the name of bean you can pass @Bean(name = "address2")
//	and Now your bean would be accessible using the variable name address2
}
