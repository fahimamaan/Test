package com.executorFramework;

public class TaskOne implements Runnable {

	@Override
	public void run() {
		
		//while(true) {
			
			try {
				
				System.out.println("running task one>>>>>>");
				Thread.sleep(1000);
			} catch (Exception e) {
			}
	//	}
		
	}

}
