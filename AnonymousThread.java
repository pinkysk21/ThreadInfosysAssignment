package threads;

public class AnonymousThread {
	
	public static void main(String args[]) {
		Thread th=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("1st Thread "+Thread.currentThread().getName());
			}
			
		});
		th.start();
		
		Thread th1=new Thread() {
			public void run() {
				System.out.println("2nd thread "+Thread.currentThread().getName());
			}
		};
		th1.start();
		
		
		new Thread() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("3rd thread "+Thread.currentThread().getName());
			}
			
		}.start();
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("4rth thread "+Thread.currentThread().getName());
				
			}
			
		}).start();
		
		Runnable r=new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("5th Thread "+Thread.currentThread().getName());
			}
			
		};
		Thread t=new Thread(r);
		t.start();
		
	}

}
