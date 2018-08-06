package me.client;

import me.bean.Animal;
import me.bean.Cat;
import me.bean.Dog;
import me.bean.Fish;
import me.bean.Turtle;

public class InterfaceDemo {

	public static void main(String[] args) {

		Dog d1 = new Dog();
		d1.id = Animal.generateID();
		
		Dog d2 = new Dog();
		d2.id = Animal.generateID();

		Cat c1 = new Cat();
		c1.id = Animal.generateID();

		Fish f1 = new Fish();
		f1.id = Animal.generateID();

		Turtle t1 = new Turtle();
		t1.id = Animal.generateID();

		System.out.println("d1.id" + d1.id);
		System.out.println("c1.id" + c1.id);
		System.out.println("f1.id" + f1.id);
		System.out.println("t1.id" + t1.id);
		System.out.println("d2.id" + d2.id);

	}

}
