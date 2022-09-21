package friday16092022;

import java.util.HashMap;

public class EmployeeDataHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer,String> m = new HashMap<Integer,String>();
		
		m.put(3678, "Kunal Sinha");
		m.put(3689, "Abhishek Khare");
		
		System.out.println(m.get(3679));
	}

}
