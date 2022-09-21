package tuesday20092022;

public class MoreOfThis {
	
	void m(MoreOfThis obj)
	{
		System.out.println("Methos id invoked");
	}
	void p()
	{
		m(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MoreOfThis s1=new MoreOfThis();
		
		s1.p();
		
		
	}

}
