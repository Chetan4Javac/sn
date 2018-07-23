package com.abc.client;

import java.util.Date;

public class ConstructorsDemo {

	static int a;
	int b; // default value 0 because instance variable
	float f; // default value 0
	boolean myB; // primitive data types;

	String s1;
	Date d1;

	ConstructorsDemo(){
		s1 = new String("abc");
	}
	
	
	public static void main(String[] args) {

		int c = 5; // will not be initialized by compiler. local var
		
		
		ConstructorsDemo demo = new ConstructorsDemo();
		ConstructorsDemo demo1 = new ConstructorsDemo();
		

		System.out.println(ConstructorsDemo.a);
		System.out.println(demo.b);
		System.out.println(demo.f);
		System.out.println(demo.myB);
		System.out.println(c);

		
		String s2 =null;
		Date d2 = null;
		
		
		
		
		System.out.println(demo.s1);
		
		String s3=demo.s1.concat("ef");
		System.out.println(s3);
		
		
		System.out.println(demo1.s1);
		System.out.println(demo.d1);	
		System.out.println(s2);
		System.out.println(d2);	


	}

}
