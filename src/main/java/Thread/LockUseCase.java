package Thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;


public class LockUseCase {
  
	
	private int count;
	private Lock lock;
	private Condition condition;
	private ReentrantReadWriteLock rw;
	
	public LockUseCase(Lock lock) {
		
		this.lock=lock;
		condition=lock.newCondition();
	}
	
public LockUseCase(ReentrantReadWriteLock loc) {
		
		this.rw=loc;
	}
	public void increment() {
		
		System.out.println("waiting for lock aquire");
		lock.lock();
		try {
			Thread.sleep(1000);
			System.out.println("lock aquire by :"+Thread.currentThread().getName());
			condition.await();
			
			System.out.println("awake by thread :"+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<10;i++)
			count=count+1;
		System.out.println("lock release by:"+Thread.currentThread().getName());
		lock.unlock();
	}
	
public void increment1() {
		
	      rw.readLock().lock();
		System.out.println("read lock aquire:"+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			System.out.println("lock aquire by :"+Thread.currentThread().getName());
			
			System.out.println("reading by thread :"+Thread.currentThread().getName());
			
			rw.readLock().unlock();
			
			rw.writeLock().lock();
			
			System.out.println("writting something here>>>>>>:"+Thread.currentThread().getName());
			Thread.sleep(1000);
			System.out.println("Still writing something>>>>"+Thread.currentThread().getName());
			
			
			rw.writeLock().unlock();
			System.out.println("writing lock is release>>>"+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void print() {
		System.out.println("count>>>>>>>>>>>>>>>>"+count);
	}
	
}
