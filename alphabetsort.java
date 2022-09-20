import java.util.Scanner;

public class alphabetsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TAKING THE INPUT
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the string to sort it in alphabetical order");
		String str = input.nextLine();
		
		System.out.print("You entered ");	
//		CHANGING STRING INTO CHAR ARRAY AND PRINTING IT
		char chararray[] = str.toCharArray();
		
		for (int print = 0; print<chararray.length; print++)
		{
			System.out.print(chararray[print]);
		}
		
//		SORTING ALGORITHM
		System.out.print("\nAfter sortig you get ");		
		for (int i=0; i<chararray.length; i++)
		{
			for(int j=i+1; j<=chararray.length-1; j++) 
			{
				if (chararray[i]>chararray[j])
				{
					char temp = chararray[i];
					chararray[i] = chararray[j];
					chararray[j]=temp;
				}
			}
		}
		
//		PRINT FINAL ANSWER
		for (int print = 0; print<chararray.length; print++)
		{
			System.out.print(chararray[print]);
		}		
	}
}