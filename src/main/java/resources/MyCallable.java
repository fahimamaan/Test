package resources;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyCallable implements Callable<String> {
	String word;
	public MyCallable(String str){
		word=str;
	}
	
	@Override
    public String call() throws Exception {
        Thread.sleep(1000);
        String reverse=reverse(word);
        //return the thread name executing this callable task
        return reverse;
    }
    
    private String reverse(String word2) {
    	String reverse = "";
    	for(int i=word2.length()-1;i>=0;i--) {
    	reverse=reverse+word2.charAt(i);
    	}
		return reverse;
	}

	public static void main(String args[]){
        //Get ExecutorService from Executors utility class, thread pool size is 10
        ExecutorService executor = Executors.newFixedThreadPool(10);
        //create a list to hold the Future object associated with Callable
        List<Future<String>> list = new ArrayList<Future<String>>();
        
        String sen="My name is fahim";
        String[] word=sen.split(" ");
        //Create MyCallable instance
        ArrayList<Callable<String>> listOfString= new ArrayList<>();
        for(int i=0; i< word.length; i++){
        	  Callable<String> callable = new MyCallable(word[i]);
            //submit Callable tasks to be executed by thread pool
        	  listOfString.add(callable);
      //      Future<String> future = executor.submit(callable);
            //add Future to the list, we can get return value using Future
          //  list.add(future);
        }
        try {
			List<Future<String>> future = executor.invokeAll(listOfString);
		
        for(Future<String> fut : future){
            try {
                //print the return value of Future, notice the output delay in console
                // because Future.get() waits for task to get completed
                System.out.print(fut.get()+" ");
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        //shut down the executor service now
        executor.shutdown();
    }
}
