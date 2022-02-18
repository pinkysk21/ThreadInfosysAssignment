package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolEx {
	
	public static void main(String args[]) {
		int nThreads=10;
		ExecutorService exService=Executors.newFixedThreadPool(nThreads);
		for(int i=0;i<20;i++) {
			exService.execute(()->{
				System.out.println(Thread.currentThread().getName()+ " is running");
				
				try {
					Thread.sleep(8000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Completed 1");
				
			});
		}
		for(int i=0;i<10;i++) {
			exService.execute(()->{
				System.out.println(Thread.currentThread().getName()+ " is running now");
				
				try {
					Thread.sleep(6000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Completed 2nd");
				
			});
		}
		exService.shutdown();
		
		
	}

}
