package revisitProj;

public class Employee extends Person {

	// When a parameterized constructor is defined, compiler will not add default
	// constructor.
	
	public int salary;
	
	Employee() {
		super();
	}

	Employee(String a, String b) {
		super(a, b);
	}
	
	public void printFullName() {
		System.out.println("Emp "+firstName + lastName);
	}
}
