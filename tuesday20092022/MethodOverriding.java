package tuesday20092022;

class Vehicle
{
	void run() {System.out.println("Vehicle is running");}
}

class Bike extends Vehicle
	{
		void run() {System.out.println("Bike is running safely");}
	}
	
public class MethodOverriding {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle obj = new Bike();
		obj.run();
		
	}

}
