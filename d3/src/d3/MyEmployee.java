package d3;

public class MyEmployee {
	
	int id;
	
	public static void main(String[] args) {
		MyEmployee e1 = new MyEmployee();
		e1.m2();
		e1.m1();
		e1.id = 1;
		//e1.id()
		
		String s1 = new String("Sunil");
		System.out.println(s1.length());
	}

	void m2(){
		System.out.println("Sunil Naidu");
	}
	
	void m1(){
		System.out.println("m1");
	}
}
