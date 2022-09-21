package friday16092022;

import java.util.Arrays;
import java.util.Scanner;

public class mergeandsort2arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
//		TAKING THE INPUT
		System.out.println("How long do you want the arrays.");
		int length = input.nextInt();
		
		 int[]array1= new int[length];
		 int[]array2= new int[length];
		 int[]result= new int[2*length];
		
		System.out.println("Enter the first array elements");
		for (int i=0;i<length;i++) 
		{
			array1[i]=input.nextInt();
		}
		
		System.out.println("Enter the secondst array elements");
		for (int i=0;i<length;i++) 
		{
			array2[i]=input.nextInt();
		}
		
//		MERGE THE ARRAYS
		int i=0;
		for (int j=0;j<2*length; j++)
		{
			
			if (i==length)
			{
				i=0;
			}
			if (j<length)
			{
				result[j]=array1[i];
				i++;
			}else
			{
				result[j]=array2[i];
				i++;
			}
			
		}
		
//		PRINT MERGED UNSORTED ARRAY
		System.out.println("Your array after merge is : ");
		for (i=0;i<2*length;i++)
		{
			System.out.print(result[i]+ " ");
		}
		
//		SORTING ALGORITHM

		for (i=0;i<2*length;i++)
		{
			for (int j=i+1; j<2*length;j++)
			{
				if(result[i]>result[j])
				{
					int temp = result[i];
					result[i]=result[j];
					result[j]=temp;
				}
			}
		}
		
//		PRINT SORTED ARRAY
		System.out.println("\nYour array after sort is : ");
		for (i=0;i<2*length;i++)
		{
			System.out.print(result[i]+ " ");
		}
			
		
	}

}
