package me.client;

import me.bean.Faculty;
import me.bean.Person;
import me.bean.Student;

public class AbstrationDemo {

	public static void main(String[] args){
		AbstrationDemo demo = new AbstrationDemo();
	
		// Can't instantiate or create objects of abstract classes.
//		Person sunil = new Person();
//		sunil.firstName = "Sunil";
		
		Student ankitha = new Student();
		ankitha.firstName = "Ankitha";
		
		Faculty sunil1= new Faculty();
		sunil1.firstName="Sunil";
	}
}
