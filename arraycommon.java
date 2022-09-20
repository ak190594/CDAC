import java.util.Scanner;

public class arraycommon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
//		TAKING THE INPUT
		System.out.println("How long do you want your arrays");
		int length = input.nextInt();
		
		int[] array1= new int[length];
		int[] array2= new int[length];
		
		System.out.println("Enter the elements for first array");
		for(int i = 0; i<length;i++)
		{
			array1[i]=input.nextInt();
		}
		
		System.out.println("Enter the elements for Second array");
		for(int i = 0; i<length;i++)
		{
			array2[i]=input.nextInt();
		}
		
//		PRINT THE INPUT ARAYS
		System.out.println("You entered arrays as ");
		for(int i = 0; i<length;i++)
		{
			System.out.print(array1[i]+", ");
		}
		System.out.println();
		
		for(int i = 0; i<length;i++)
		{
			System.out.print(array2[i]+", ");
		}
		
//		FINDING THE COMMON ELEMENTS
		int flag=0;
		
		System.out.print("\nThe common element in the given two arrays: ");		
		for(int i=0; i<length; i++)
		{
			for (int j=0; j<length;j++)
			{
				if(array1[i]==array2[j])
				{
					flag++;
					System.out.print(array1[i]+", ");
				}
			}
		}	
		if(flag==0)
		{
			System.out.print("No common elements");
		}		
	}
}