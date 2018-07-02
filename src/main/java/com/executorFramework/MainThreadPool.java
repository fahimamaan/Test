package com.executorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class MainThreadPool implements Runnable{

	
	private static ExecutorService executor=null;
	private static Future<String> onOutput=null;
	private static Future<String> twoOutput=null;
	
	public MainThreadPool() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		executor= Executors.newFixedThreadPool(2);
		MainThreadPool pool= new MainThreadPool();
		Thread t= new Thread(pool);
		t.start();
	}

	@Override
	public void run() {
		
		while(true) {
		checkSumbit();
		}
	}

	@SuppressWarnings("unchecked")
	private void checkSumbit() {
		
		
		
		if(onOutput==null || onOutput.isDone()) {
			
			onOutput=(Future<String>) executor.submit(new TaskOne());
		}
		if(twoOutput==null || twoOutput.isDone()) {
			
			twoOutput=(Future<String>) executor.submit(new TaskTwo());
		}
	}
}
