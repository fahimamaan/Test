package Thread;

import java.util.ArrayList;
import java.util.List;

public class Producer implements Runnable {

	 List<Integer> list;
	int size;
	public Producer(List<Integer> list,int size) {
   this.list= list;
   this.size=size;
	}
	
	
	public void checkProduce() {
		while(true) {
		synchronized (list) {
			
			while(list.size()==size)
			{
				System.out.println("list is full");
				try {
					list.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			produceData();
		}
		
	}
	}


	private void produceData() {
		
		synchronized(list) {
		for (int i = 0; i < size; i++) {
			list.add(i);
			try {
				System.out.println(" producing >>>"+i);
				Thread.sleep(1000);
			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		list.notifyAll();
		}
		
	}


	@Override
	public void run() {
		System.out.println("in Producer rum method"+ Thread.currentThread().getName());	
		checkProduce();
	}
}
