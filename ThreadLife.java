
public class ThreadLife implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("2: The current state is "+Thread.currentThread().getState());
		
	}
	
	public static void main(String args[]) throws InterruptedException {
		Thread tl=new Thread(new ThreadLife());
		tl.setName("1st Thread");
		System.out.println("1:  The current state is "+tl.getState());
		tl.start();
		Thread.sleep(1000);
		System.out.println("3:  The current state is "+tl.getState());
		System.out.println("t1 Alive status"+tl.isAlive());
		System.out.println("4: The main thread state is "+Thread.currentThread().getState());
		System.out.println(Thread.currentThread().getName() +" alive status is "+Thread.currentThread().isAlive());
		
		
	}

}
