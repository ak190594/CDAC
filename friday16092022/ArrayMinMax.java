package friday16092022;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		List l = new ArrayList();
		
		System.out.println("Enter 10 number to find the minimum and maximum");
		
		int element=input.nextInt();
		l.add(element);
		int min=element;
		int max=element;
		
		for(int i=0; i<9;i++)
		{
			element=input.nextInt();
			l.add(element);
			if(min>element)
			{
				min=element;
			}
			if(max<element)
			{
				max=element;
			}
		}
		
		System.out.println("the Maximum is : " + max + "\nthe minimum is :" + min);
		
	}

}
