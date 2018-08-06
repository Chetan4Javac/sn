package revisitProj;

public class Person {
	
	public String firstName;
	public String lastName;
	
	Person(){
		
	}
	
	Person(String a, String b){
		firstName = a;
		lastName = b;
	}

	
	public void printFullName() {
		System.out.println("Person "+firstName + lastName);
	}
}
