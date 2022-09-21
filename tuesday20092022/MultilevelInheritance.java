package tuesday20092022;

class BabyDog extends Dog{
	void weep(){
		System.out.println("Weeping...");
	}
}


public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BabyDog bd = new BabyDog();
		bd.weep();
		bd.bark();
		bd.eat();
	}

}
