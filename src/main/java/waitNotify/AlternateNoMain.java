package waitNotify;

public class AlternateNoMain {

	
	public static void main(String[] args) {
		Object monitor= new Object();
		AlternateNumber noAlternateNumber = new AlternateNumber(monitor);
		Thread t= new Thread(noAlternateNumber, "A");
		Thread t1= new Thread(noAlternateNumber, "B");
		Thread t3= new Thread(noAlternateNumber, "J");
		
		t.start();
		t1.start();
		t3.start();
		
		//System.out.println("main thread>>>>>>>>>>");
	}
}
