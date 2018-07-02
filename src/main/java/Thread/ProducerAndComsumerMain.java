package Thread;

import java.util.ArrayList;
import java.util.List;

public class ProducerAndComsumerMain {

	
	public static void main(String[] args) {
		List<Integer> list =new ArrayList<>();
		int size=5;
		Producer p= new Producer(list,size);
		Consumer q= new Consumer(list,size);
		Thread t=new Thread(p);
		Thread r=new Thread(q);
		t.start();
		r.start();
		
		System.out.println("main thread>>>>");
	}
}
