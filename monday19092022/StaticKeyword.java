package monday19092022;

public class StaticKeyword {

	int rollno;
	String name;
	static String college = "ITS";
	
	StaticKeyword(int r, String n)
	{
		rollno = r;
		name = n;
	}
	void display()
	{
		System.out.println(rollno + " " + name+ " "+ college);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticKeyword s1= new StaticKeyword(111, "Karan"),s2= new StaticKeyword(222, "Aryan");
		
		StaticKeyword.college="BBDIT";
		s1.display();
		s2.display();
	}

}
