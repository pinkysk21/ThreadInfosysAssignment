
public class TestWithoutJoin extends Thread {

	
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(" Executing "+Thread.currentThread().getName());
		}
	}
	
	public static void main(String args[]) throws InterruptedException {
		TestWithoutJoin t1=new TestWithoutJoin();
		TestWithoutJoin t2=new TestWithoutJoin();
		t1.setName("Thread 1");
		t2.setName("Thread 2");;
		t1.start();
		t2.start();
		System.out.println(" Main Thread "+Thread.currentThread().getName());
	}
}


