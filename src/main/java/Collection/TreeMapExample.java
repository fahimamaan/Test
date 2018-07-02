package Collection;

import java.util.TreeMap;

import Beans.Employee;

public class TreeMapExample {

	public static void main(String[] args) {
              
		TreeMap<Employee, String> map= new TreeMap<>();
		
		Employee emp= new Employee("fahim", 20, "new delhi");
		Employee emp1= new Employee("amaan", 20, "new delhi");
		Employee emp2= new Employee("fahim", 20, "new delhi");
		map.put(emp1, "amaan");
		map.put(emp, "dublicate");
		map.put(emp2, "fahim");
		
		System.out.println(map.get(emp2));
	}
}
