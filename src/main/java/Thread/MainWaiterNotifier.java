package Thread;

public class MainWaiterNotifier {

	
	
	public static void main(String[] args) {
		String message="jao mai nae aa rha";
		
		WaiterThread w= new WaiterThread(message);
		Notifier n= new Notifier(message);
		
		Thread t= new Thread(w);
		Thread t1= new Thread(n);
		t.start();
		t1.start();
	}
}
