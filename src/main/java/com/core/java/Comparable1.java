package com.core.java;

public class Comparable1 {

	
	 String name;
	 String address;
	 int age;
	public Comparable1(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Comparable1 [name=" + name + ", address=" + address + ", age=" + age + "]";
	}
	 
	
	
}
