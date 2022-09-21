package tuesday20092022;

class Cat extends Animals{
	void meow() {
		System.out.println("meowing...");
	}
}

public class HierarchialInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat c = new Cat();
		
		c.meow();
		c.eat();
	
		
	}

}
