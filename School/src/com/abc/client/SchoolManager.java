package com.abc.client;


import com.abc.bean.Room;
import com.abc.bean.School;
import com.abc.bean.Student;
import com.abc.bean.Teacher;

public class SchoolManager {
	
	public static void main(String[] args){
		
		School school1 = new School();
		school1.teachers = new Teacher[2];
		
		Teacher teacher = new Teacher();
		teacher.firstName = "Sunil";
		teacher.lastName = "Naidu";
		teacher.empId = 1;
		
		Teacher teacher2 = new Teacher();
		teacher.firstName = "Chetan";
		teacher.lastName = "Kumar";
		teacher2.empId = 2;
		
		
		school1.teachers[0] = teacher;
		school1.teachers[1] = teacher2;
		
		Room room = new Room();
		Student student = new Student();
		
		student.firstName = "Malli";
		student.lastName = "PV";
		student.rollNum=1;
	}

}
