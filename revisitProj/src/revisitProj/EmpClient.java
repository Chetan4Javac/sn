package revisitProj;

public class EmpClient {

	EmpClient() {
		super();
	}

	public static void main(String[] a) {
/*		EmpClient ec = new EmpClient();

		Employee e = new Employee();
		System.out.println(e.firstName + e.lastName);

		Employee e1 = new Employee("Sunil", "Naidu");
		System.out.println(e1.firstName + e1.lastName);
		
		e1.printFullName();
*/		
		Person p1 = new Person("Chetan", "Gorkal");
		p1.printFullName(); // person class method
		
		p1 = new Employee("Chetan", "Gorkal");
		p1.printFullName();// Employee class method
		
	}
}
