package d3;

public class ArrayDemo {

	
	public static void main(String[] args) {
		// local variables will not be assigned default values.
		// instance variables defined in classes will be assigned default values.
		
		int[] a; // declaration
		a = new int[10];

		a[0] = 1;
		a[1] = 2;
		a[2] = 5;
		a[3] = 3;
		a[4] = 4;
		
		// least element in the array
		// max element in the array
		// AO, DO
		// search for an element
		
		for(int i=0; i<a.length; i++){
			a[i]=i+10;
		}
		
		
		System.out.println(a.length);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}
