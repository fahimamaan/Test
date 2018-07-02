package resources;

import java.util.concurrent.atomic.AtomicInteger;

public class Message1 implements Runnable{
  
	Object monitor;
	Boolean first=true;
	Boolean second=false;
	Boolean third=false;
	int current;
	AtomicInteger turn;
	String msg;
	
	public Message1(String msg,AtomicInteger turn,int current,Object monitor) {
		this.msg=msg;
		this.turn=turn;
		this.current=current;
		this.monitor=monitor;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		synchronized (monitor) {
			if(turn.get()%3==current && first) {
				
				System.out.print(msg);
				turn.getAndIncrement();
				 first=false;
				 second=true;
				 third=false;
				monitor.notifyAll();
				try {
					monitor.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if(turn.get()%3==current && second) {
				
				System.out.print(msg);
				turn.getAndIncrement();
				 first=false;
				 second=false;
				 third=true;
				monitor.notifyAll();
				try {
					monitor.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if(turn.get()%3==current && third) {
				System.out.print(msg);
				turn.getAndIncrement();
				 first=true;
				 second=false;
				 third=false;
				monitor.notifyAll();
				try {
					monitor.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				try {
					monitor.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
			
		
	}

}
