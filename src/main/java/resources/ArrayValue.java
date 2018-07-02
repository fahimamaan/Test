package resources;

import java.util.HashMap;

public class ArrayValue {
           
	String name;
	String age;
	
	public ArrayValue(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public void setValue(String[] arr) {
		
		arr[3]="amaan";
	}
	
	
	public void m2(String[] arr) {
		
		setValue(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+":>>inside m2");
		}
		
		for(String ar:arr) {
			System.out.println(ar);
		}
	}
	
	
	public static void main(String[] args) {
		
		HashMap<ArrayValue, String> ar= new HashMap<>();
		
	
		
		ArrayValue value=new ArrayValue("fahim","age");
		ar.put(value, "danish");
		
		value.setAge("changed");
		System.out.println(ar.get(value));
		String[] arr=new String[4];
		arr[0]="faf";
		
		value.m2(arr);
	}
	
	
}
