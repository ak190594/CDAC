import java.util.Scanner;

public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String evenlist="";
		String oddlist="";
//		int esum=0, osum=0;
		
		int i=0;
		
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
//						evenlist=evenlist+esum;
					}
					else {
						oddlist= oddlist + ", " + variable;
//						oddlist= oddlist+osum;
					}
		
				}
			}
			
				

			
		
		System.out.println("The Odd number entered by you are" + oddlist + "\nThe even numbers you enetered are" + evenlist + "\nYou also entered " + i + " negative numbers");
	
//		System.out.println("Even sum is:\t"+ esum);
//		System.out.println("Odd sum is:\t"+ osum);
	}

	}


