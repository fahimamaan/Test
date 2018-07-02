package com.spring.com_spring;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListToMap {

	
	public static void main(String[] args) {
		List<String> cards = Arrays.asList("Visa-mam", "MasterCard-mm", "American Express-mmdd","Visa-mnn"); 
		Map cards2Length = (Map) cards.stream().
				collect(Collectors.toMap(b->b.toString().split("-")[0],b->b.toString().split("-")[1],(oldvalue,newValue)->oldvalue,LinkedHashMap::new))
				.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
         System.out.println(cards2Length);
         
         String cc= "dd Gggege fgefwg fgeg";
         Map usingSlipt=Stream.of(cc.split(" ")).collect(Collectors.toMap(x->x, String::length));
         System.out.println(usingSlipt);
         
         System.out.println("after slip map");
         String string="ffkjf fkahfjk ewq m euwfehfe jfjewoe o fewopp";
         Map list=Stream.of(string.split(" ")).map(e->new String(e)).collect(Collectors.toList()).stream()
        		 .sorted(new Comparator<String>() {
        			 public int compare(String o1, String o2) {
        				return o1.compareTo(o2);
        			 };
				}).collect(Collectors.toMap(x->x,x->x.length(),(oldvalue,newValue)->newValue,LinkedHashMap::new));
         System.out.println(list);
         
          String[] abc= {"dd","Gggege","fgefwg","fgeg"};
          String join=Arrays.asList(abc).stream().filter(x-> !"dd".equals(x)).collect(Collectors.joining(",","[","]"));
          System.out.println(join);
	}
}
