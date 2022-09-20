package collection;

public class Student {

	int rollno;//instance variable
	String name;
	static String college="ITS";//static variable
	//constructor
	Student(int r, String n)
	{
		rollno = r;
		name = n;
	}
	//method to display the values
	void display()
	{
		System.out.println(rollno + " " + name + " " + college);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(233,"Shruti"), s2=new Student(122,"Shriti");
		s1.display();
		s2.display();
	}

}
