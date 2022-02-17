package threads;

public class SynchronizedBlocks {

	public static void main(String args[]) {
		PrintDetails pDetails=new PrintDetails();
		Thread t1=new Thread(new Thread31(pDetails));
		Thread t2=new Thread(new Thread4(pDetails));
		t1.setName("1st thread");
		t2.setName("2nd thread");
		t1.start();
		t2.start();
	}
}



class Thread4 implements Runnable{
	PrintDetails pd;
	
	Thread4(PrintDetails pd){
		this.pd=pd;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		pd.print();
		
	}
	
}


class Thread31 implements Runnable{
	PrintDetails pd;
	
	Thread31(PrintDetails pd){
		this.pd=pd;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		pd.print();
		
	}
	
}

class PrintDetails{
	public void print() {
		System.out.println("Printing for "+Thread.currentThread().getName());
		int a=10;
		int b=5;
		System.out.println(" Printing for "+Thread.currentThread().getName()+a+b);
		synchronized(this) {
			for(int i=0;i<6;i++) {
				System.out.println(i+" "+Thread.currentThread().getName());
			}
		}
	}
}