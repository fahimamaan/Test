package waitNotify;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Producer implements Runnable{
    Object monitor;
    
    Lock lock;
	Condition condition;
	public Producer(Object monitor) {
		super();
		this.monitor = monitor;
	}

	public Producer(Lock lock)  {
		super();
		this.lock = lock;
		condition=lock.newCondition();
	}
	@Override
	public void run() {
		System.out.println("producer");
		callWaitNotify();
		//callLockMethod();
		
	}

	private void callLockMethod() {
 while(true) {
			lock.lock();
 
		try {

			Thread.sleep(1000);

			System.out.println("2");
			System.out.print(" Thread-" + Thread.currentThread().getName());
			System.out.println("after 1000 milisecond thread is going to waiting stae");
			Thread.sleep(1000);
			System.out.println("thead :" + Thread.currentThread().getName() + " : is wating");
			condition.signalAll();
			condition.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lock.unlock();
 }
	
	}

	private void callWaitNotify() {
		
		while (true) {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			synchronized (monitor) {

				try {

					Thread.sleep(1000);

					System.out.println("2");
					System.out.println(" Thread-" + Thread.currentThread().getName());
					System.out.println("after 1000 milisecond thread is going to waiting stae");
					Thread.sleep(1000);
					System.out.println("thead :" + Thread.currentThread().getName() + " : is wating");
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
