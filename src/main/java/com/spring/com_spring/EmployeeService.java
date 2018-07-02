package com.spring.com_spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class EmployeeService implements InitializingBean,DisposableBean{
  
	
	Employee employee;
	
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeService() {
		System.out.println("constructor called EmployeeService");
	}
	
	public void destroy() throws Exception {
		System.out.println("EmployeeService destroy method is callled");
		
	
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("EmployeeService initializing to dummy value");
		if(employee.getFirstName() == null){
			employee.setFirstName("Pankaj");
		}
	}

}
