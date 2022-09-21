package Wednesday210922;



interface Banks{
	float RateofInterest();
}
class Sbis implements Banks{
	public float RateofInterest() {
	return 9.5f;
}
}
class Pnbs implements Banks{
	public float RateofInterest() {
		return 9.7f;
	}
}
public class TestInterface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Banks b=new Sbis();
			System.out.println("ROI:"+b.RateofInterest());
	}

}
