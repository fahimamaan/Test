package Thread;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLock implements Runnable{

	ReentrantReadWriteLock readWrite=new ReentrantReadWriteLock();
	LockUseCase ucase=new LockUseCase(readWrite);
	@Override
	public void run() {
		ucase.increment1();
		
		
	}
	public static void main(String[] args) {
		ReadWriteLock t=new ReadWriteLock();
		
		new Thread(t).start();
		 new Thread(t).start();
		 new Thread(t).start();
		 System.out.println("main thread>>>");
	}
	
}
