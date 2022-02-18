package threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CollectionExecutor {

		public static void main(String args[]) {
			
		List<Employee> list=new ArrayList<>();
		list.add(new Employee("Tom","Home"));
		list.add(new Employee("Jim","Ralph"));
		list.add(new Employee("Maggie","Hord"));
		list.add(new Employee("Tom","Hardy"));
		list.add(new Employee("Jim","Jack"));
		list.add(new Employee("JACK","Alfred"));
		list.add(new Employee("Mary","Pops"));
		list.add(new Employee("VENI","Carl"));
		list.add(new Employee("Kat","Jack"));
		list.add(new Employee("Jerry","Tom"));
		list.add(new Employee("Tom","Jerry"));
		list.add(new Employee("Merry","Chris"));
		list.add(new Employee("CHRIS","LENNY"));
		list.add(new Employee("CHRIS","RALPH"));
		list.add(new Employee("Mie","Hord"));
		list.add(new Employee("JENNY","Hary"));
		list.add(new Employee("Jim","Jend"));
		list.add(new Employee("Missy","Hord"));
		list.add(new Employee("JES","Pops"));
		list.add(new Employee("JENNNY","Carl"));
		list.add(new Employee("JAM","Jack"));
		list.add(new Employee("JESSICA","Tom"));
		list.add(new Employee("PENNY","Jerry"));
		list.add(new Employee("KRIS","Chris"));
		list.add(new Employee("CHRIS","LENNY"));
		list.add(new Employee("KEND","RALPH"));
		list.add(new Employee("MONI","Hord"));
		list.add(new Employee("JEN","Hary"));
		list.add(new Employee("JAK","JORD"));
		list.add(new Employee("MARY","Hord"));
		
		new CollectionExecutor().convertToLowerCase(list);
	}

	private void convertToLowerCase(List<Employee> list) {
		ExecutorService service=Executors.newFixedThreadPool(10);
		
		for(Employee e:list) {
			service.execute(()->
			{
				System.out.println(e.getFirstName().toLowerCase()+" "+e.getLastName().toLowerCase());
				System.out.println(Thread.currentThread().getName());
			});
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		service.shutdown();
		
	}
	
	
}

class Employee {
	
	
	private String firstName;
	private String lastName;
	
	
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + "]";
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		

	}

