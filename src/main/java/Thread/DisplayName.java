package Thread;

public class DisplayName {
	
	public void show(String name) {
		
		synchronized (this) {
			for(int i=0;i<10;i++) {
				System.out.println("name is >>>");
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.print(name);
				}
		}
		
	}

}
