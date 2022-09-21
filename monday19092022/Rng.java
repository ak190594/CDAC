package monday19092022;

import java.util.Random;
import java.util.Scanner;

public class Rng {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter the prefix string");
			String prefix = input.nextLine();
			
			Random rng=new Random();
			double rand = Math.random();
			
			for(int i=0;i<10;i++)
			{
				System.out.println(prefix+" "+rng.nextInt()+" "+rand);
			}
		
	}

}
