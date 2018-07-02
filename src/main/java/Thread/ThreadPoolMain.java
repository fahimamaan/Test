package Thread;

public class ThreadPoolMain {

	
	public static void main(String[] args) {
		
		
		ThreadPool main = new ThreadPool(4,6);
		
		for(int i=0;i<6;i++) {
			
			Task t= new Task(i);
			try {
				main.execute(t);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
