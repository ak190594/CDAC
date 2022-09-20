import java.util.Scanner;
import java.lang.Math;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int check=0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number.");
		
		int object = input.nextInt();

		if (object==0  || object==1) 
		{
			System.out.println("Its not a prime Numner!");
		}
		else 
		{
			for (int i=2; i<=object/2;i++) 
			{
				if (object%i==0) 
				{
					System.out.println("Tis not a prime number.");
					check+=1;
					break;
				}
			}
			if (check==0)
			{
				System.out.println("This is a Prime number.");
			}
			
		}
		
		
	}

}
