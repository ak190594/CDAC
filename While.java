import java.util.Scanner;
import java.lang.Math;
public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			int i=0;
//			System.out.println("Printing the list of first 10 even numbers");
//			
//			while (i<10)
//			{
//				if(i==7) 
//				{
//					break;
//				}
//				System.out.println(i);
//				i+=2;
//			}
//			System.out.println("using do while");
//
//			do
//			{
//				System.out.println(i);
//				i+=2;
//				
//			}
//			while(i<20);
//			
//			int j=0;
//			while (j<10)
//			{
//				if (j==7)
//				{
//					break;
//				}else if(j%2==0)
//				{
//					System.out.println(j);
//					
					
//				}
//				j++;
//			}
//				int star=0, line=1;
//				
//				for(line=1;line<=7;)
//				{
//					if(star<line)
//					{
//						System.out.print("*");
//						star++;
//						continue;
//					}
//					System.out.println();
//					star=0;
//					line++;
//				}
				
				Scanner input = new Scanner(System.in);
				while(true)
				{
					System.out.println("Enter a number.");
					int n=	input.nextInt();	
					if (n!=37)
					{
						System.out.println("Lol no, you entered " + n + ". Try again!");
						continue;
					}
					else
					{
						System.out.println("Whatever.");
						break;
					}
				}
							System.out.println(Math.sqrt(225));
			
	}	
}