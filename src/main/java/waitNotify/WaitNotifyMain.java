package waitNotify;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class WaitNotifyMain {

	
	public static void main(String[] args) {
		 Object lock= new Object();
		 Lock lock1= new ReentrantLock();
		 Producer p= new Producer(lock);
		 Comsumer c= new Comsumer(lock);
		 
		 Thread t1= new Thread(p);
		 Thread t2= new Thread(c);
		 t1.start();
		 t2.start();
		 
		 System.out.println("main thread>>>>");
	}
}
