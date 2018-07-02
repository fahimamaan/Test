package waitNotify;

public class AlternateNumber implements Runnable{

	
	Boolean first=true;
	Boolean second=false;
	Boolean third=false;
	
	Object monitor;
	
	public AlternateNumber(Object object) {
		
		this.monitor=object;
	}

	@Override
	public void run() {
		
		while(true) {
			
		synchronized (monitor) {
		String threadName= Thread.currentThread().getName();
		
			if("A".equals(threadName) && first) {
				System.out.println("1");
				first=false;
				second=true;
				third=false;
				monitor.notifyAll();
				try {
					Thread.sleep(1000);
					monitor.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			 if("B".equals(threadName) && second) {
				
				System.out.println("2");
				first=false;
				second=false;
				third=true;
				
				monitor.notifyAll();
				try {
					Thread.sleep(1000);
					monitor.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			 if("J".equals(threadName) && third) {
				
				System.out.println("3");
				first=true;
				second=false;
				third=false;
				monitor.notifyAll();
				try {
					Thread.sleep(1000);
					monitor.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		}
	}
	
	
}
