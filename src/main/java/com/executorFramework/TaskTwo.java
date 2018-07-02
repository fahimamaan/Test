package com.executorFramework;

public class TaskTwo implements Runnable{

	@Override
	public void run() {
		//while(true) {
			
			try {
				System.out.println("running task two>>>>>");
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		//}
	}

}
