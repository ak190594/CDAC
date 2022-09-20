package collection;

public class examplethis 
	{
		int rollno;
		String name, course;
		float fee;
			examplethis (int rollno, String name, String course)
			{
				this.rollno=rollno;
				this.name=name;
				this.course=course;
			}
			examplethis (int rollno, String name, String course, float fee)
			{
				this(rollno, name, course);//reusing constructor
				this.fee=fee;
			}
			void display()
			{
				System.out.println(rollno + " " + name + " " + course + " " + fee);
			}
			
					public static void main(String[] args) {
						// TODO Auto-generated method stub
						
						examplethis s1=new examplethis(11, "Avinash", "BCA");
						examplethis s2 =new examplethis (12, "Ankit", "BCA", 16000);
						s1.display();
						s2.display();
						
					}
		

	}

