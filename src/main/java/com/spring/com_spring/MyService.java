package com.spring.com_spring;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@SuppressWarnings("restriction")
public class MyService {
	@PostConstruct
	public void init(){
		System.out.println(" annotation MyService init method called");
	}
	
	public MyService(){
		System.out.println("MyService no-args constructor called");
	}
	
	@PreDestroy
	public void destory(){
		System.out.println("MyService destroy method called");
	}
}
