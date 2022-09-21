package tuesday20092022;


class Animals{
	void eat() {
		System.out.println("Eating...");
	}
}
class Dog extends Animals{
	void bark() {
		System.out.println("barking...");
	}
}

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d = new Dog();
		d.bark();
		d.eat();
	
		
	}

}
