package Tuesday20092022;

import java.util.Scanner;

class Emp{
	int PCno;
	String Name;
	String Desig;
	String Stream;
	String Group;
	
	void input()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Please Input the PC no\t");
		PCno = input.nextInt();
		System.out.println("Please Input the Name\t");
		Name = input.nextLine();
		System.out.println("Please Input the Desi\t");
		Desig = input.nextLine();
		System.out.println("Please Input the Trade\t");
		Stream = input.nextLine();
		System.out.println("Please Input the Group\t");
		Group = input.nextLine();
	}
	void display()
	{
		System.out.println("PC no is:\t "+ PCno);
		System.out.println("Name is:\t "+ Name);
		System.out.println("Desi is:\t "+ Desig);
		System.out.println("Trade is:\t "+ Stream);
		System.out.println("Group is:\t "+ Group);
	}
	
	
}


class DRTC extends Emp
{
	String Cadre;
	
	void addCadre() {
		
	}
	
}
class DRDS extends Emp
{
	String Cadre;
	
	void addCadre() {
		System.out.println("Input cadre");
		
	}
	
}
public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
