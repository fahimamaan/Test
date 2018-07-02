package Thread;

public class Notifier implements Runnable{

	
	 String message;
	 
	 public Notifier(String str) {

		 message=str;
		 // TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	synchronized (message) {
		
		
		for(int i=0;i<5;i++) {
			System.out.println("Notifier name of thread"+Thread.currentThread().getName());
			System.out.println("notifier>>>>>"+message);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				Thread.sleep(1000);
				message.notifyAll();
				message.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("aftyer notifier>>>");
		}
		
		
	}
		
	}

}
