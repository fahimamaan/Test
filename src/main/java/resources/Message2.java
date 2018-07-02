package resources;

import java.util.concurrent.atomic.AtomicInteger;

public class Message2 implements Runnable{
	AtomicInteger monitor;
	String msg;
	public Message2(String msg,AtomicInteger monitor) {
		this.msg=msg;
		this.monitor=monitor;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		if(monitor.get()==2) {
		System.out.println(msg);
		
		}
	}

}
