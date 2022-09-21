package monday19092022;


class Rectangle
{
	int length, width;
	
	void insert (int l, int w)
	{
		length=l;
		width = w;
		
	}
	void calculateArea() {
		
	
	System.out.println(length*width);
}
}


public class TestRectangle2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r1 = new Rectangle(), r2= new Rectangle();
		
		r1.insert(11, 5);
		r2.insert(3, 15);
		r1.calculateArea();
		r2.calculateArea();
		
	}

}
