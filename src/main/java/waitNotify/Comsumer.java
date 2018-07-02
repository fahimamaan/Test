package waitNotify;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Comsumer implements Runnable {
    Object monitor;
    Lock lock;
   	Condition condition;
	public Comsumer(Object monitor) {
		super();
		this.monitor = monitor;
	}
	public Comsumer(Lock lock)  {
		super();
		this.lock = lock;
		condition=lock.newCondition();
	}
	@Override
	public void run() {
		System.out.println("consumer");
		callWaitNotifu();
	   // callLockMethod();
	}
	private void callLockMethod() {
		while(true) {
		lock.lock();
		System.out.println("1");
		
		try {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getName()+" is going to waiting state");
			condition.signalAll();
			condition.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lock.unlock();
		}
	
		
	}
	@SuppressWarnings("unused")
	private void callWaitNotifu() {

		while(true) {
			
			synchronized (monitor) {
				
				
				System.out.println("1");
				
				try {
					Thread.sleep(1000);
					System.out.println(Thread.currentThread().getName()+" is going to waiting state");
					monitor.notifyAll();
					monitor.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}
	}

}
