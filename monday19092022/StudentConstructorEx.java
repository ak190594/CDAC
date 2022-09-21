package monday19092022;

public class StudentConstructorEx {

	int id;
	String name;
	
	StudentConstructorEx(int i, String n)
	{
		id=i;
		name=n;
		
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StudentConstructorEx s1= new StudentConstructorEx(111, "Karan"),s2= new StudentConstructorEx(222, "Aryan");
		s1.display();
		s2.display();
	}

}
