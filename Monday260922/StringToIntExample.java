package Monday260922;

public class StringToIntExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaring String Variable
		String s = "200";
		String s1 ="9990449935";
		String a ="23.6";
		long t= 999393939399L;
		//Converting String into integer using Integer.parseInt()
		int i=Integer.parseInt(s);
		long l=Long.parseLong(s1);
		float f=Float.parseFloat(a);
		double d=Double.parseDouble(a);
		System.out.println(l);
		System.out.println(d);
		String p=String.valueOf(t);
		System.out.println(p);
		System.out.println(f);
		System.out.println(s+100);//200100, because "200"+100, here + is a string concatenation operator  
		System.out.println(i+100);//300, because 200+100, here + is a binary plus operator  
	}

}
