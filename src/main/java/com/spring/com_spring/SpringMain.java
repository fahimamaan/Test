package com.spring.com_spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("resources/spring.xml");

		System.out.println("Spring Context initialized");
		
		//MyEmployeeService service = ctx.getBean("myEmployeeService", MyEmployeeService.class);
		MyAwareService service = ctx.getBean("myAwareService", MyAwareService.class);

		System.out.println("Bean retrieved from Spring Context");
		
		//System.out.println("Employee Name="+service.getEmployee().getFirstName());
		
		
		System.out.println("Spring Context Closed");
		
		Scope scope = (Scope) ctx.getBean("scopeTest");
        Scope scopeDuplicate = (Scope) ctx.getBean("scopeTestDuplicate");
        
        System.out.println(scope == scopeDuplicate);
        System.out.println(scope.hashCode() + "::" + scopeDuplicate.hashCode());
        ctx.close();
	}
}
