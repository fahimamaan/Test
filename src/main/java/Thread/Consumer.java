package Thread;

import java.util.List;

public class Consumer implements Runnable{

	
	 List<Integer> list;
		int size;
	public Consumer(List<Integer> list,int size) {
		   this.list= list;
		   this.size=size;
			}
	
	public void checkConsumer() {
		
		while(true) {
		synchronized (list) {
			
		while(list.isEmpty()) {
			System.out.println("list is empty waiting for procuder ");
			try {
				list.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		conmsumer();
		}
	}
	}

	private void conmsumer() {
		
		System.out.println("in comsuming state");
		for (int i = 0; i < list.size(); i++) {
			try {
				System.out.println("consuming >>>>>>>>:"+list.get(i));
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			list.remove(i);
			
		}
		list.notifyAll();
	}

	@Override
	public void run() {
		System.out.println("in comsumer rum method"+ Thread.currentThread().getName());
		checkConsumer();
	}
}
