package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Semaphore1 implements Runnable {

	List<Integer> list= new ArrayList<>();
	Semaphore sem; 
	boolean a=true;
	boolean b=true;
	public Semaphore1(Semaphore sem) {
		// TODO Auto-generated constructor stub
		this.sem=sem;
	}
	@Override
	public void run() {
		
		while(true) {
		if(Thread.currentThread().getName().equals("A") && a) {
			
			//System.out.println("waiting for permit A");
			try {
				sem.acquire();
				a=false;
				b=true;
				System.out.println("1");
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println("before release lock in A");
			sem.release();
		}else {
			
			//System.out.println("waiting for permit B");
			
			
			try {
				sem.acquire();
				a=true;
				b=false;
				System.out.println("2");
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//System.out.println("before release lock in B");
			sem.release();
		}
		
		}
		 
	}

	
	 public static void main(String[] args) {
		 Semaphore sem= new Semaphore(1);
		 Semaphore1 sh= new Semaphore1(sem);
		 Thread t= new Thread(sh,"A");
		 Thread t2= new Thread(sh,"B");
		 
		 t.start();
		 t2.start();
		 
	}
}
