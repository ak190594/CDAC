package collection;

import java.util.Scanner;

public class marvel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
//		TAKING THE INPUT
		System.out.println("How long do you want your arrays");
		int length = input.nextInt();
		
		int[] [] array1= new int[length];
		int[] [] array2= new int[length];
		
		System.out.println("Enter the elements for first array");
		for(int i = 0; i<length;i++)
		{
			array1[i]=input.nextInt();
		}
		
		System.out.println("Enter the elements for Second array\n");
		for(int i = 0; i<length;i++)
		{
			array2[i]=input.nextInt();
		}
//		Printing
		
	}

}
