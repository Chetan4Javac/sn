package d3;

public class Employee {
	
	int id;
	
	static int counter;
	
	public static void main(String[] args) {
		m1();
		//printCompleteName();
		
		Employee e1 = new Employee();
		e1.m2();
		e1.id = 1;
		
		Employee e2 = new Employee();
		e2.m2();
		e2.id = 2;
		
		Employee.counter = 1;

	}

	
	static void m1(){
		System.out.println("Sunil N");
	}
	
	void m2(){
		System.out.println("Sunil Naidu");
	}
}
