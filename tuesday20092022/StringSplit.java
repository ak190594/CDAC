package tuesday20092022;

import java.util.Scanner;

public class StringSplit {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Give the Input String");
		String original=input.nextLine();
		
		String stringarray[] = original.split(" ");
		
		for(int i=0;i<stringarray.length;i++)
		{
			if (stringarray[i].length()>1&&stringarray[i].length()%2==0)
			{
				System.out.println(stringarray[i]);
			}
		}
	}
}
