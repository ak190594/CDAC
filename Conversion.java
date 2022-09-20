import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the temprature in Farenhite : ");
		Float temprature = input.nextFloat();
		
		System.out.println("Your temprature in celcius is : " + (((temprature-32)*5)/9));
		
		
		System.out.println("Enter the temprature in Celcius : ");
		temprature = input.nextFloat();
		
		System.out.println("Your temprature in Farenhite is : " + (((temprature*9)/5)+32));

	}

}
