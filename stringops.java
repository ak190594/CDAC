import java.util.Scanner;

public class stringops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the string to check if its a pallindrome or not!");
		String str = input.nextLine();
		
		String reverse = "";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse+=str.charAt(i);
		}
		
		System.out.println("The reverse of "+ str+" is "+reverse);
		System.out.println("The string you entered is "+str.length()+" characters long.");
		
//		if(str.compareTo(reverse)==0) {
//			System.out.println("This is a pallindrome");
//		}
//		else
//		{
//			System.out.println("This is NOT a pallindrome");
//		}
		
		if(str.equals(reverse)) {
			System.out.println("This is a pallindrome");
		}
		else
		{
			System.out.println("This is NOT a pallindrome");
		}
//		System.out.println("a".compareTo("A"));
	
	}

}
