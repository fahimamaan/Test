package Thread;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class Semaphore1 {
    public static int count =0;
	Semaphore lock;
	Condition condition;
	public Semaphore1(Semaphore lock,Lock lock1) {
		
		this.lock=lock;
		condition=lock1.newCondition();
	}
	
	public void increment() {
		try {
			System.out.println("before lock acquire inside increament method"+Thread.currentThread().getName());
			Thread.sleep(1000);
			lock.acquire();
		
			System.out.println("ater lock acquire inside increament method"+Thread.currentThread().getName());
		for(int i=0;i<4;i++) {
			Thread.sleep(1000);
			count=count+1;
			condition.await();
			condition.notifyAll();
			System.out.println(count);
	
		}
		lock.release();
		System.out.println("after lock release inside increament method"+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void decreament() {
		
		System.out.println("inside decrement method");
	}
}
