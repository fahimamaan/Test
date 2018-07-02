package resources;

import java.util.concurrent.atomic.AtomicInteger;

public class WaitNotifyThread{
	 
	
	
	public static void main(String[] args) {
		Object monitor= new Object();
		AtomicInteger count= new AtomicInteger(0);
		Message1 m1=new Message1("welcome",count,0,monitor);
		Message1 m2=new Message1("to",count,1,monitor);
		Message1 m3=new Message1("Sapient",count,2,monitor);
		Thread t1= new Thread(m1);
		Thread t2= new Thread(m2);
		Thread t3= new Thread(m3);
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
