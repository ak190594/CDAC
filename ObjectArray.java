package collection;

public class ObjectArray {
	public static void main(String[] args) {
		Account obj[]=new Account[2];
		obj[0]=new Account();
		obj[1]=new Account();
		
		obj[0].setData(1,2);
		obj[1].setData(3,4);
		System.out.println("For array Element 0");
		obj[0].showData();
		System.out.println("For array Element 1");
		obj[1].showData();	
	}

	private static Account showData() {
		// TODO Auto-generated method stub
		return null;
	}
}
class Account
	{
		int a;
		int b;
		public void setData(int c, int d)
		{
			
			a=c;
			
			b=d;
		}
		public void showData()
		{
			System.out.println(a+ " "+ b);
		}
	}