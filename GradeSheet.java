import java.util.Scanner;

public class GradeSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc =new Scanner(System.in);
		System.out.println("Please eneter the value of x:\t");
		x=sc.nextInt();
		System.out.println("\nInputted value of x is:\t"+ x);
		
		if(x>90)
			System.out.println("A");
		else if (70<x || x<90)
			System.out.println("B");
		else if (40<x ||x<70)
			System.out.println("C");
		else
			System.out.println("D");
		
				
	}

}
