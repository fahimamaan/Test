package Thread;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SemaphoreMain implements Runnable{
	Semaphore1 sema;
	Semaphore lock;
	public SemaphoreMain(Semaphore1 sema,Semaphore lock) {
         this.sema=sema;
         this.lock=lock;
	}
	
	
	public static void main(String[] args) {
		Lock lock1= new ReentrantLock();
		Semaphore lock= new Semaphore(1);
		Semaphore1 one = new Semaphore1(lock,lock1);
		SemaphoreMain abc=new SemaphoreMain(one, lock);
		Thread t= new Thread(abc);
		Thread t1= new Thread(abc);
		t.start();
		t1.start();
		
	}

	@Override
	public void run() {
		
		System.out.println("inside run method of semaphoreMain"+Thread.currentThread().getName());
		sema.increment();
		
	}
}
