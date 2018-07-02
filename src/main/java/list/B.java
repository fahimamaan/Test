package list;

public class B extends A{

	B(){
		System.out.println("B Constructor called");
	}
	  static {
		  System.out.println("static block in b");
	  }
		public void show() throws RuntimeException {
			System.out.println("inside b");
			
		} 

		public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
			// TODO Auto-generated method stub
			 Class clazz = Class.forName("list.B");
		        B demo = (B) clazz.newInstance();

		}
}
	