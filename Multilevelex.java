package collection;

class Animals{
	void eat()
	{
		System.out.println("Eating........");
	}
}
class Dogs extends Animals
{
		void bark()
		{
			System.out.println("Barking...........");
		}
}
class BabyDog extends Dogs
{
	void weep()
	{
		System.out.println("Weeping..........");
	}
}

public class Multilevelex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog d = new BabyDog();
		d.weep();
		d.eat();
		d.bark();
	}

}
