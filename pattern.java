
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int i, j;
		for(i=0; i<5;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		for(i=5; i>0;i--)
		{
			for(j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(i=0;i<5;i++)
		{
			for(j=4-i; j>0;j--) 
			{
				System.out.print(" ");
			}
			for(j=0; j<=i;j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		for(i=4;i>0;i--)
		{
			for(j=0;j<=4-i;j++) 
			{
				System.out.print(" ");
			}
			for(j=0; j<i;j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}
}
