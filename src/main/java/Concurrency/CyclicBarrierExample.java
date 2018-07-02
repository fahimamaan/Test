package Concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample implements Runnable{
        
	CyclicBarrier breakPoint= new CyclicBarrier(4, new Runnable() {

		@Override
		public void run() {
			
			System.out.println("let's refill the petrol--");
		}
		
		
	});
	
	public static void main(String[] args) {
		CyclicBarrierExample demo= new CyclicBarrierExample();
		Thread t1= new Thread(demo,"Thread1");
		Thread t2= new Thread(demo,"Thread2");
		Thread t3= new Thread(demo,"Thread3");
		Thread t4= new Thread(demo,"Thread4");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
	@Override
	public void run() {
		try {
		
		System.out.println(Thread.currentThread().getName()+": reach the first checkpoint>>");
	
			breakPoint.await();
			System.out.println(Thread.currentThread().getName()+": reach the second  checkpoint>>");	
			breakPoint.await();
			
			System.out.println(Thread.currentThread().getName()+": reach the third checkpoint>>");
			breakPoint.await();
			System.out.println(Thread.currentThread().getName()+": reach the destination>>");
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	
}
