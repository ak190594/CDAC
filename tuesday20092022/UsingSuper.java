package tuesday20092022;

class Animal { // Superclass (parent)
	  public void animalSound() {
	    System.out.println("The animal makes a sound");
	  }
	}

	class Doggo extends Animal { // Subclass (child)
	  public void animalSound() {
	    super.animalSound(); // Call the superclass method
	    System.out.println("The dog says: bow wow");
	  }
	}


public class UsingSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Doggo myDog = new Doggo(); // Create a Dog object
	    myDog.animalSound(); // Call the method on the Dog object
	    
	}

}
