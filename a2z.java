import java.util.Scanner;

public class a2z {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		                                                                                                               
		
		for (int ass=65; ass<91;ass++)
		{
		
		char yourass = (char) ass;
		
		System.out.print(yourass+"   ");
		}
	
	
		Scanner input = new Scanner(System.in);
	
		System.out.println("\nEnter a number to reverse ");
	
		String original = input.nextLine();
	
		int size = original.length();
	
		System.out.print("\nReverse of " + original + " is \n" );
	
		for (int i=0; i<size; i++) 
		{
			System.out.print(original.charAt(original.length()-i-1));
		}
	
		System.out.println("\nNumber for its multiplication table ");
		int subject = input.nextInt();
		
		for (size=1;size<11;size++)
		{
			System.out.print(size*subject + "  ");
		}
		
		
	}


}

