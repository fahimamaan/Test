package Thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class RunningLock implements Runnable{
 Lock lock= new ReentrantLock();
	
	LockUseCase ucase=new LockUseCase(lock);
	@Override
	public void run() {
		ucase.increment();
		
		ucase.print();
		
	}

	
	public static void main(String[] args) {
		RunningLock t=new RunningLock();
		
		new Thread(t).start();
		 new Thread(t).start();
		 
		 System.out.println("main thread>>>");
	}
}
