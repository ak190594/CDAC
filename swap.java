import java.util.Scanner;
public class fp {
	public static void main(String args[])
	{
		System.out.println(" :::::::::::\n :::**:::::: \n :*    *::::  \nC* 0   0 *D\n *  _^_  *\n  *    *  \n  ::*.*::   \n   ::::: \n    :::    ");
		
		int x=10;
		int y=20;
		System.out.println("\nThe value of x is before swap\t\t:"+x);
		System.out.println("The value of y is before swap\t\t:"+y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		
		System.out.println("The value of x is after swapping\t :"+ x);
		System.out.println("The value of y is after swapping\t :"+ y);
	
	 int temp = x;
	 x=y;
	 y=temp;
	 
	 System.out.println("The value of x is after swapping again :"+ x);
		System.out.println("The value of y is after swapping again :"+ y);
		
		
		temp=x+y;
		y=temp-y;
		x=temp-y;
	 
		System.out.println("The value of x is after swapping again :"+ x);
		System.out.println("The value of y is after swapping again :"+ y);

		}
		
		
		
		
	}
	
