package Wednesday210922;

public class StrBuilder {
/*Driver Code*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String ("Hello");//String 1
		String s2 = new String (" World");//String 2
		String s = String.format("%s%s", s1,s2);//String 3 stores the result
		System.out.println(s.toString());//displays Result
	}

}
