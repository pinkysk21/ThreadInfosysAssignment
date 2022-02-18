package threads;

public class LambdaThreads {

	public static void main(String args[]) {
			
			Thread th1=new Thread(()-> {
					System.out.println("1st Thread "+Thread.currentThread().getName());});
			th1.start();
			
			
			new Thread(()-> 
			{
				for(int i=0;i<5;i++) {
					System.out.println(i+" "+Thread.currentThread().getName());
				}
			}
				).start();
			
			Runnable r=()->
					{
						int a=10;
						int b=5;
						System.out.println(a*b);
						System.out.println(Thread.currentThread().getName());
				    };
		
			new Thread(r).start();
	

}
}
