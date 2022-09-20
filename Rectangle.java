package collection;

class TestRectangle2
{
	int length, width;

	void insert(int l, int w)
	{			
		int length=l;
		int width=w;
		System.out.println(length*width);

	}
//	void calculateArea()
//	{
//		
//	}

	public void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println(length*width);
	}
}
public class Rectangle 
{
	 public static void main(String[] args) 
	{
			// TODO Auto-generated method stub
		 TestRectangle2 r1= new TestRectangle2(), r2=new TestRectangle2();
		r1.insert(5,5);
		r2.insert(6,6);
		r1.calculateArea();
		r2.calculateArea();
	}
}
