package com.core.java;

public class Element {

private int num;
private String name;
private int age;
public Element(int num, String name, int age) {
	super();
	this.num = num;
	this.name = name;
	this.age = age;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Element [num=" + num + ", name=" + name + ", age=" + age + "]";
}


}
