import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" :::::::::::\n :::**:::::: \n :*    *::::  \nC* 0   0 *D\n *  _^_  *\n  *    *  \n  ::*.*::   \n   ::::: \n    :::    ");
		
//		int a=19, b=11;
		//int b=11;
		//int c= a+b;
//		System.out.println("\n The addition of a and b is:" + (a+b));
//		
//		String firstn= "Kunal", lastn= " Sinha";
//		//String lastn= "Sinha";
//		System.out.println("\n First string and second string is-\t"+ firstn + lastn);
		
		Scanner in1 = new Scanner (System.in);
		System.out.println("Input 1st number");
		int a=in1.nextInt();
		
		System.out.println("Input 2nd number");
		int b=in1.nextInt();
		
		System.out.println("\n The addidtion of first number and second number is:\t"+ (a+b));
		Scanner input= new Scanner (System.in);
		
		System.out.println("WHATS YOUR FIRST NAME ");
		String firstname = input.nextLine();
		
		System.out.println("WHATS yo Last name ");
		String lastname=input.nextLine();
		
		System.out.println("\nThere's concatinated string is:\t " + firstname + " " + lastname);
	}

}
