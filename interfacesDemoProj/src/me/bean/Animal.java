package me.bean;

public abstract class Animal {

	static public int counter;
	
	public int id;
	public String name;
	// 5 cats, 5 dogs, 5 turtles, 5 fishes
	// 1-5, 6-10, 11-15, 16-20
	
	public static int generateID(){
		return ++counter;
	}
	
	public abstract void m1();
}
