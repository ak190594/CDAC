package wednesday21092022;

import java.util.Scanner;

public class FindAdnReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		String s = String.valueOf(a);
		System.out.println(s);
		
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter your string.");
			String str2=input.nextLine();
			
			System.out.println("Which sub string do you need to replace");
			char find2 = input.next().charAt(0);
			
			System.out.println("What do you want to replace it with");
			char replace2 = input.next().charAt(0);
			
			System.out.println(str2.replace(find2, replace2));
		}
		
	}

}
