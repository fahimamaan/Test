package Thread;

public class ThreadInplementation {

	
	public static void main(String[] args) {
		Thread t= new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<10;i++) 
				System.out.println("runnnning>>>>>>>>>");
			}
		});
		t.start();
		Thread t2= new Thread(()-> System.out.println("running>>"));
		t2.start();
	}
	
	
	
}
