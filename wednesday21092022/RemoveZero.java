package wednesday21092022;

import java.util.Scanner;

public class RemoveZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter the input string");
		String original = input.nextLine();
		int flag=0;
		for (int i=0; i<original.length(); i++)
		{
			if (original.charAt(i)!='0')
			{
				flag=i;
				break;
			}
		}
		
		for (int i=flag;i<original.length();i++)
		{
			System.out.print(original.charAt(i));
		}
		input.close();
	}

}
