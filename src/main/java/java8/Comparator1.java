package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Comparator1 {
	
	
	
	private static List<Developer> getDevelopers() {

		List<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", "delho"));
		result.add(new Developer("alvin", "meerut"));
		result.add(new Developer("jason", "delho"));
		result.add(new Developer("iris", "agra"));
		
		return result;

	}
	
	public static void main(String[] args) {
		List<String> lines = Arrays.asList("spring", "node", "mkyong");
		
		lines=lines.stream().filter(name->
		!"node".equals(name)
		).collect(Collectors.toList());
		
		System.out.println(lines);
		List<Developer> list= Comparator1.getDevelopers();
		
		for(Developer dev:list) 
			System.out.println(dev);
		 Comparator<Developer> abc=(t1,t2)-> t1.getName().compareTo(t2.getName());
		System.out.println("----------------");
		list.sort(abc.reversed());
		List<String> nameWithAdd=list.stream().filter(dev-> !"alvin".equals(dev.getName())).map(dev->dev.getName()).collect(Collectors.toList());
		list.forEach(dev->System.out.println(dev));
		
		System.out.println("______________");
		System.out.println(nameWithAdd);
		
		Developer dev= list.stream().filter(dev1-> "alvin".equals(dev1.getName())).findAny().orElse(null);
	System.out.println("value of alvin+"+dev);
	
	
	List<Integer> num = Arrays.asList(1,2,3,4,5);
	long sum=num.stream().count();
	System.out.println(sum);
	
	HashMap<String, Integer> ab= new HashMap<>();
	ab.put("fahim", 1);
	ab.put("amaan", 2);
	HashMap<String, Integer> bc= new HashMap<>();
	bc.put("fahim", 1);
	bc.put("amaan", 2);
	System.out.println(ab.equals(bc));
	}
	
}
