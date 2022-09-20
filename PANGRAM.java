import java.util.Scanner;
public class PANGRAM {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the string to check if its a PANGRAM or Not");
		String str = input.nextLine();
		
		int flag=0;
		
		for (char i='a'; i<='z'; i++)	
		{
			if (str.indexOf(i)==-1)
			{
				System.out.println("This is not a PANGRAM");
				flag++;
				break;
			}
		}
		if (flag==0)
		{
			System.out.println("This is a PANGRAM");
		}
	}
}
