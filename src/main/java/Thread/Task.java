package Thread;

public class Task implements Runnable{
  
	private int threadName;
	public Task(int num) {
		threadName=num;
	}
	
	@Override
	public void run() {
		System.out.println(threadName+">>>>>>task executing");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
