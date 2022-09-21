package tuesday20092022;

class Bank{
	int roi = 7;
	void getRateOfInterest(){
		
		System.out.println("Bank Interest "+roi);
	}
}

class Sbi extends Bank{
	float roi=7.1f;
	void getRateOfInterest(){
		
		System.out.println("SBI Interest "+roi);
	}
}
class Icici extends Bank{
	
	
	void getRateOfInterest(){
		float roi=7.2f;
		System.out.println("ICICI Interest "+roi);
	}
}
class Axis extends Bank{
	float roi=7.3f;
	
}

public class RateOfInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank obj_sbi = new Sbi();
		Bank obj_icici = new Icici();
		Bank obj_axis = new Axis();
		
		obj_sbi.getRateOfInterest();
		obj_icici.getRateOfInterest();
		obj_axis.getRateOfInterest();
		
		System.out.println("SBI Interest " +obj_sbi.roi);
		System.out.println("Axis Interest " +obj_axis.roi);


		
	}

}
