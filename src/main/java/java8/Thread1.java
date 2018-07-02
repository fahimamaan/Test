package java8;

public class Thread1 implements Runnable{
  
	
	Thread1(Object object){
		this.monitor=object;
	}
	Object monitor= new Object();
	private boolean first=true;
	private boolean second=true;
	private boolean third=true;
	@Override
	public void run() {
		
		while(true) {
			
			synchronized(monitor) {
				if(first && Thread.currentThread().getName().equals("t1")) {
					
					print(1);
					first=false;
					second=true;
				    third=false;
					try {
						monitor.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					monitor.notifyAll();
				}else if(second && Thread.currentThread().getName().equals("t2")) {
					
					print(2);
					first=false;
					second=false;
					third=true;
					try {
						monitor.notifyAll();
						monitor.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}else if(third && Thread.currentThread().getName().equals("t3")) {
					
					print(3);
					first=true;
					second=false;
					third=false;
					try {
						monitor.notifyAll();
						monitor.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				} else
					{
					try {
						monitor.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					}
			}
			
		}
	}
	
	
	
	private void print(int i) {
		System.out.println("Printing value>>>"+i);
		
	}



	public static void main(String[] args) {
		Object ob= new Object();
		
		Thread1 t= new Thread1(ob);
		Thread t1= new Thread(t,"t1");
		Thread t2= new Thread(t,"t2");
		Thread t3= new Thread(t,"t3");
		t1.start();
		t2.start();
		t3.start();
	}

}
