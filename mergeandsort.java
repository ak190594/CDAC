package collection;

import java.util.Scanner;

public class mergeandsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("How may no do you want to insert in an array:\t");
		int length = input.nextInt();
		int[] array1= new int[length];
		int[] array2= new int[length];
		int[] merge = new int[2*length];
		int i=0, j=0, temp=0;
		System.out.println("Enter the first array element");
		for(i=0;i<length;i++)
		{
			array1[i]=input.nextInt();
//			System.out.println("First array elements are:\t"+ array1[i]);
		}
		
		
		
		System.out.println("Enter the second array element:\t");
		for(i=0;i<length;i++)
		{
			array1[i]=input.nextInt();
//			System.out.println("First array elements are:\t"+ array2[i]);
		}
		
//		Merge Algorithm
		
		for(j=0;j<2*length;j++) 
		{
			if (i==length)
			{
				i=0;
			}
			if (j<length)
			{
				merge[j]=array1[i];
				i++;
			}
			else
			{
				merge[j]=array2[i];
				i++;
			}
		}
			
		
		for (i=0;i<2*length;i++)
		{
			for(j=i+1;j<2*length;j++)
			{
				if(merge[i]>merge[j])
				{
					temp =merge[i];
					merge[i]=merge[j];
					merge[j]=temp;
				}
			}
		}
		
//		Printing
		
		System.out.println("\nAfter sorting and merging");
		for(i=0;i<2*length;i++)
		{
			System.out.println(merge[i]+" ");
		}
	}

}
