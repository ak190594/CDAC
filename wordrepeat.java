import java.util.Scanner;

public class wordrepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Type your sentence");
		String str = input.nextLine();
		
		String stringarray[] = str.split(" ");
		
		for(int i=1;i<stringarray.length;i++)
		{
			if (stringarray[i].compareTo(stringarray[i-1])==0)
			{
				System.out.println("The word '" + stringarray[i] + "' is repeated at " + i);
			}
		}
		
	}

}
