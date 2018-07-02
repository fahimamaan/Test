package com.core.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ComparableMain {

	
	 public static void main(String[] args) {
		
		 List<Comparable1> list= new ArrayList<>();
		 Comparable1 c1= new Comparable1("fahim", "address", 26);
		 Comparable1 c2= new Comparable1("ankita", "patiala", 16);
		 Comparable1 c3= new Comparable1("gaurav", "punjab", 25);
		 Comparable1 c4= new Comparable1("rajesh", "ddsg", 32);
		 Comparable1 c5= new Comparable1("sbsb", "fawfF", 69);
		 list.add(c1);
		 list.add(c2);
		 list.add(c3);
		 list.add(c4);
		 list.add(c5);
		 list.sort((o1,o2)->o1.getAddress().compareTo(o2.getAddress()));
		// Collections.sort(list, new ComparatorByAddress());
		 System.out.println(list);
	}
}
