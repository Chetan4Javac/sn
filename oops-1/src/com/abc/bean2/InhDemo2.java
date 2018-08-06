package com.abc.bean2;

import com.abc.bean.Student;
import com.abc.bean.Teacher;

public class InhDemo2 {



	public static void main(String[] args) {
		
		
		Attender a = new Attender();
		System.out.println(a.myProtectedField);
		System.out.println(a.myPublicField);
		
		
		
		
		
		Teacher t1 = new Teacher();
		t1.firstName = "Sunil";
		t1.lastName = "Naidu";
		t1.mobileNum = "234567890";

		Student s1 = new Student();
		s1.firstName = "Vinod";
		s1.lastName = "H";
		s1.mobileNum = "1234567890";
		
		
		System.out.println("Teacher: " + t1.firstName + " " + t1.lastName + " " + t1.myProtectedField);
		System.out.println("Student: " + s1.firstName + " " + s1.lastName + " " + s1.myProtectedField);
	}


	
}
