import java.util.Scanner;

public class Arrytest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int[]a =new int[100];
	boolean flag=false;
	for(int i=0;i<100;i++) {
		a[i]=i+1;
}
	Scanner in =new Scanner(System.in);
	System.out.println("Enter the number to search");
	int num=in.nextInt();
	for(int i=0;i<100;i++) {
		if(a[i]==num){
			System.out.println("The number is found at "+i+"th Index");
			flag=true;
			break;
		}
	}
	if (!flag) {
		System.out.println("The number not found");
		}
	}
}
