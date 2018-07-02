package com.spring.com_spring;

public class MyEmployeeService {
	private Employee employee;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public MyEmployeeService(){
		System.out.println("MyEmployeeService no-args constructor called");
	}

	//pre-destroy method
	public void destroy() throws Exception {
		System.out.println("MyEmployeeService Closing resources");
	}

	//post-init method
	public void init() throws Exception {
		System.out.println("xml based MyEmployeeService initializing to dummy value");
		if(employee.getFirstName() == null){
			employee.setFirstName("Pankaj");
		}
	}
}
