package monday19092022;


//USING LOOPS
//public class factorial {
//
//	void fact(int n) {
//		int fact = 1;
//			for (int i=1;i<=n;i++)
//			{
//				fact*=i;
//			}
//			System.out.println("Factorials is " + fact);
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//			new factorial().fact(5);
//		
//	}
//
//}

//USING RECURSION PROGRAMMING
public class factorial {

	 static int fact(int n) 
	{
			if(n==1 || n==0) {
				return 1;
			
			}
			else {
				return n*fact(n-1);
			}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println("the factorial is " +fact(16));
		
	}

}