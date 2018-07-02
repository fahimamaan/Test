package Thread;

public class WaiterThread implements Runnable{
	
	String message;

	 public WaiterThread(String str) {
		// TODO Auto-generated constructor stub
		 message=str;
	}

	@Override
	public void run() {
		
		synchronized (message) {
			for(int i=0;i<5;i++) {
				try {
					
					Thread.sleep(1000);
				System.out.println("WaiterThread name of thread"+Thread.currentThread().getName());
				Thread.sleep(1000);
				System.out.println("WaiterThread message inside sync block:"+message);
				
				message.notifyAll();
					message.wait();
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				System.out.println("after waiting ");
			}
			
		}
		
	}
	 
	 
}
