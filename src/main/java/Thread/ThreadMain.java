package Thread;

public class ThreadMain extends Thread{

	
	DisplayName name;
	String treadName;
	public ThreadMain(DisplayName name,String tName) {
		
		this.name=name;
		treadName=tName;
		
	}
	
	@Override
	public void run() {
		
		name.show(treadName);
	}
	
	
      public static void main(String[] args) {
    	  
    	  DisplayName name= new DisplayName();
    	  DisplayName name1= new DisplayName();
		ThreadMain mai= new ThreadMain(name, "Dhoni");
		  
	   ThreadMain tu= new ThreadMain(name, "Yuv");
	   mai.start();
	   tu.start();
	   
	}
	
}
