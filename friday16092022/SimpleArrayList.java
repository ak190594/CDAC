package friday16092022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);

		List l = new ArrayList();
		
		System.out.println("Enter the input");
		String str = input.nextLine();		
		l.add(str);
		
		System.out.println("Enter the input");		
		str = input.nextLine();		
		l.add(str);
		
		for (int i=0; i<l.size(); i++)
		{
			System.out.println(l.get(i));
		}
		
		System.out.println(l);
	}

}
