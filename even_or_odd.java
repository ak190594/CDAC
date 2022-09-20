import java.util.Scanner;

public class even_or_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		String evenlist="";
		String oddlist="";
		int i=0, oddsum=0, evensum=0;
		
		
		while(true){
			System.out.println("Enter a number to check if it's even or odd. Enter 0 to exit the program.");
			int variable = input.nextInt();
		
			
				if (variable==0) {
					break;
				}
				else {
					if (variable<0) {
						i +=1;

					}
					else if (variable%2==0) {
						evenlist= evenlist + ", " + variable;
						evensum = evensum + variable;
					}
					else {
						oddlist= oddlist + ", " + variable;
						oddsum = oddsum + variable;
					}
		
				}
			}
			
				

			
		
		System.out.println("The Odd number entered by you are" + oddlist + "\nits sum is " + oddsum + "\nThe even numbers you enetered are" + evenlist + "\nits sum is " + evensum + "\nYou also entered " + i + " negative numbers");
	}

}
