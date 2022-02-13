
public class TestWithRunnable implements Runnable{

	public static void main(String args[]) {
		Thread th=new Thread(new TestWithRunnable());
		th.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		System.out.println("Runnable running"+Thread.currentThread().getName());
	}

}
