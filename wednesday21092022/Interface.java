package wednesday21092022;

interface Banks{
	float rateOfInterest();
	
}

class Sbis implements Banks{
	public float rateOfInterest() {
		return 9.15f;
	}
}

class Pnbs implements Banks{
	public float rateOfInterest() {
		return 9.7f;
	}
}

public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Banks b= new Sbis();
	
		System.out.println("ROI: "+b.rateOfInterest());
		
	}

}
