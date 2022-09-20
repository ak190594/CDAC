package collection;

class Animal{
	void eat()
	{
		System.out.println("Eating........");
	}
}
class Dogies extends Animal
{
		void bark()
		{
			System.out.println("Barking...........");
		}
}


public class SingleInhert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogies d = new Dogies();
		d.eat();
		d.bark();
	}

}
