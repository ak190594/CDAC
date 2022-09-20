import java.util.Scanner;

public class arrayduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
		
//		TAKING THE INPUT
		System.out.println("How long do you want your arrays");
		int length = input.nextInt();
		
		int[] array1= new int[length];
		System.out.println("Enter the elements for first array");
		for(int i = 0; i<length;i++)
		{
			array1[i]=input.nextInt();
		}
		
//		FINDING AND REMOVING THE DUPLICATES
		for(int i=0; i<length; i++)
		{
			int flag=0;
			for(int j=0; j<i;j++)
			{				
				if (array1[i]==array1[j])
				{
					flag++;
					break;
				}				
			}
			if (flag==0) {
				System.out.println(array1[i]);
			}
		}		
	}
}