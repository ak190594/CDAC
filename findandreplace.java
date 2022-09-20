import java.util.Scanner;

public class findandreplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		TAKING THE INPUTS
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your string.");
		String str=input.nextLine();
		
		System.out.println("Which sub string do you need to replace");
		String find = input.nextLine();
		
		System.out.println("What do you want to replace it with");
		String replace = input.nextLine();
		
//		PRINT THE ENTIRE STRING EXCEPT FOR THE FIND CHARACTER WHICH WHEN ENCOUNTERED PRINT REPLACE CHARACER
		for (int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==find.charAt(0))
			{
				System.out.print(replace.charAt(0));
			}
			else
			{
				System.out.print(str.charAt(i));

			}
		}
		System.out.println();
		
//		SAME PROGRAM BUT WITH REPLACE METHOD
		System.out.println("Enter your string.");
		String str2=input.nextLine();
		
		System.out.println("Which sub string do you need to replace");
		char find2 = input.next().charAt(0);
		
		System.out.println("What do you want to replace it with");
		char replace2 = input.next().charAt(0);
		
		System.out.println(str.replace(find2, replace2));
		
	}

}
