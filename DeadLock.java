package threads;

public class DeadLock {
	static String s1="Apple";
	static String s2="Mango";
	public static void main(String args[]) {

		Thread50 t50=new Thread50();
		Thread52 t52=new Thread52();
		t50.setName("1stThread");
		t52.setName("2nd thread");
		t50.start();
		t52.start();
	

}

static class Thread50 extends Thread{

	
	public void run() {
		System.out.println("Before  1st lock "+Thread.currentThread().getName());
		synchronized(s1) {
			System.out.println("s1 locked by "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("trying to acquire 2nd lock "+Thread.currentThread().getName());
			synchronized(s2) {
				System.out.println("s2 locked by "+Thread.currentThread().getName());
			}
		}
		System.out.println("Both locks released"+Thread.currentThread().getName());
				
	}
}

static class Thread52 extends Thread{
	

	public void run() {
		System.out.println("Before  1st lock "+Thread.currentThread().getName());
		synchronized(s2) {
			System.out.println("s2 locked by "+Thread.currentThread().getName());
			
			System.out.println("trying to acquire 2nd lock "+Thread.currentThread().getName());
			synchronized(s1) {
				System.out.println("s1 locked by "+Thread.currentThread().getName());
			}
		}
		System.out.println("Both locks released"+Thread.currentThread().getName());
				
		
	}
	
}
}
