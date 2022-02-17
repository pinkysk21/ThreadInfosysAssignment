package threads;

public class Synchronization {

	public static void main(String args[]) {
		Print print=new Print();
		Thread1 t1=new Thread1(print);
		Thread2 t2=new Thread2(print);
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t1.start();
		t2.start();
		
	}
}
class Thread1 extends Thread{
	Print p1;
	Thread1(Print p){
		p1=p;
	}
	public void run() {
		p1.printWithoutSync();
		p1.printWithSync();
	}
}

class Thread2 extends Thread{
	Print p2;
	Thread2(Print p){
		p2=p;
	}
	public void run() {
		p2.printWithoutSync();
		p2.printWithSync();
	}
}

class Print{
	
	public void printWithoutSync() {
		
		for(int i=0;i<5;i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}
		
	}
	
	public synchronized void printWithSync() {
		
		for(int i=10;i<15;i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}
}