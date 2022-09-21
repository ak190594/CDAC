package friday16092022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		List lst = new ArrayList();
		
		String[] str = new String[5];
		
		System.out.println("Enter 5 string elements.");
		for (int i=0;i<5;i++)
		{
			str[i]=input.nextLine();
			lst.add(str[i]);
		}
		
		for (int i=0;i<5;i++)
		{
			System.out.println(str[i]);
		}
		System.out.println(lst);
		
		
		
	}

}
