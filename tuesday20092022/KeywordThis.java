package tuesday20092022;

public class KeywordThis {
	
	int rollno;
	String name,course;
	float fee;
	
	KeywordThis (int rollno, String name,String course)
	{
		this.rollno=rollno;
		this.name=name;
		this.course=course;
		
	}
	
	KeywordThis(int rollno,String name,String course, float fee)
	{
		this(rollno, name, course);
		this.fee=fee;
		
	}
	void display()
	{
		System.out.println(rollno+" "+ name+" "+course+" "+fee);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		KeywordThis student = new KeywordThis(11, "Ramesh", "FSB", 200);
		
		student.display();
		
		
		
	}

}
