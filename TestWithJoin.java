
public class TestWithJoin extends Thread {

	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(" Executing "+Thread.currentThread().getName());
		}
	}
	
	public static void main(String args[]) throws InterruptedException {
		TestWithJoin t1=new TestWithJoin();
		TestWithJoin t2=new TestWithJoin();
		t1.setName("Thread 1");
		t2.setName("Thread 2");;
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		System.out.println(" Main Thread "+Thread.currentThread().getName());
	}
}
