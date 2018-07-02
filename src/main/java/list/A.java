package list;

public class A {

  A(){
	  System.out.println("a constructor called");
  }
  
  static {
	  System.out.println("static block in a");
  }
public void show() throws NullPointerException {
	System.out.println("inside a");
} 

} 

