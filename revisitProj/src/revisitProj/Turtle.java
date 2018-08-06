package revisitProj;

public class Turtle implements Swimmable, Walkable{

	@Override
	public void swim() {
		System.out.println("Turtle swimming");
	}

	@Override
	public void walk() {
		System.out.println("Turtle walking");
	}

}
