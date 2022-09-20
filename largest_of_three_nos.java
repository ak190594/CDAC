import java.util.Scanner;

public class largest_of_three_nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int i=0;
		while(i==0) {
		
		System.out.println("Input 1st no.\t");
		int a=sc.nextInt();
		
		System.out.println("Input 2nd no.\t");
		int b=sc.nextInt();
		
		System.out.println("Input 3rd no.\t");
		int c=sc.nextInt();
		
		
		
		System.out.println("Inputted value\t"+ a+"\t"+ b+"\t"+ c);
	
		if(a==b || a==c || b==c) {
			System.out.println("It'd be nicer if you had entered three distinct numbers. let's try again");
			}
		else if (a>c && a>b) {
			System.out.println("The First no is largest among them");
			break;
			}
		else if (b>c && b>a) {
			System.out.println("The Second no is largest among them");
			break;
			}
		else {
			System.out.println("The Third no is largest among them");
			break;
			}
	
	
	}
	}
}
