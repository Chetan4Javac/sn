package me.bean;

public class Turtle extends Animal implements Swimmable, Walkable{

	@Override
	public void swim() {
		System.out.println("Turle swimming");
	}

	@Override
	public void walk() {
		System.out.println("Turle Walking");
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

}
