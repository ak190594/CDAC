package Thursday22092022;

import java.util.Arrays;
import java.util.Scanner;


public class PhoneNoValidate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your phone number");
		String phone = input.nextLine();
		
		if (phone.matches("\\d{10}"))
				{
			System.out.println("Validated phone");
		}
		else
		{
			System.out.println("Invalid");
		}
		
		
		String source = "There are thirty-three big-apples";
		String[] parts = source.split("(?<=\\w)(?=\\W)|(?<=\\W)(?=\\w)");
		
		for (int i=0; i<parts.length;i+=2)
		{
			System.out.println(parts[i]);
		}
		System.out.println(Arrays.toString(parts));
		
		
		System.out.println("Enter your email");
		String email = input.nextLine();
		
		if(email.matches("(.+)@(.+)"))
		{
			System.out.println("Validated mail");
		}
		else
		{
			System.out.println("Invalid");
		}
		
		
		
	}

}
