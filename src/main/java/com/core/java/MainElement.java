package com.core.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainElement {

	public static void main(String[] args) {
		
		
	Element em= new Element(1, "fahim", 12);
	Element em1= new Element(1, "fahim", 12);
	Element em2= new Element(11, "rajesh", 10);
	Element em3= new Element(15, "sandy", 21);
	Element em4= new Element(17, "fahimdf", 25);
	
	List<Element> al= new ArrayList<>();
	al.add(em1);
	al.add(em2);
	al.add(em3);
	al.add(em4);
	al.add(em);
	System.out.println(al.size());
List<Element> al1=	al.stream().filter(e->e.getAge()>10).distinct().collect(Collectors.toList());
	
System.out.println(al1);
System.out.println(al1.size());
	}
}
