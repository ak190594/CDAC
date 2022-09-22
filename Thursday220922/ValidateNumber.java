package Thursday220922;

import java.util.Scanner;

public class ValidateNumber {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter your Phone number: ");
	      String phone = sc.next();
	      //Regular expression to accept valid phone number
	      String regex = "\\d{10}";
	      //Matching the given phone number with regular expression
	      boolean result = phone.matches(regex);
	      if(result) {
	         System.out.println("Given phone number is valid");
	      } else {
	         System.out.println("Given phone number is not valid");
	      }
	}
}
