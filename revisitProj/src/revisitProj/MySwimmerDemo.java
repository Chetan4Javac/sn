package revisitProj;

public class MySwimmerDemo {

	public static void main(String[] args) {
		Fish f = new Fish();
		f.swim(); // Fish swmming
		
		Turtle t = new Turtle();
		t.swim();// Turtle swmming
		
		
		Swimmable s = new Fish();
		s = new Turtle();
		s.swim();
		//s.walk(); // not valid
		Walkable w = new Turtle();
		w.walk();
	}
}
