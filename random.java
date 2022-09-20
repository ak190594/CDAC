package collection;

import java.util.Random;
import java.util.Scanner;

public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the prefix value");
		String prefix = sc.nextLine();
	
		
		Random bg= new Random();
		for(int i=0;i<10; i++)
		{
			System.out.println(prefix + bg.nextInt());
		}
		
	}

}
