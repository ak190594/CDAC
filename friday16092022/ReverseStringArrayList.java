package friday16092022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseStringArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		List lst = new ArrayList();
		
		System.out.println("Enter the Elements. enter 0 to exit and reverse order");
		
		while(true)
		{
			String str = input.nextLine();
			if(str.equals("0"))
			{
				break;
			}
			else {
			lst.add(str);
			}
					
		}
		System.out.println("You entered the list as : " + lst);
		
		System.out.println("the list inreversed order is: ");
		for (int i=lst.size()-1; i>=0; i--)
		{
			System.out.println(lst.get(i));
		}
		
		
	}
}
