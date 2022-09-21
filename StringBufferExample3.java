package Wednesday210922;

public class StringBufferExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer ("Hello");
		sb.replace(1,3,"Java"); //now original string is changed
		System.out.println(sb);//prints HJavalo

	}

}
