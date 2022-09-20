package collection;
import java.util.HashMap;
public class EmployeeData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(3677, "Narendra Kumar Singh");
		map.put(3678, "Kunal Sinha");
		map.put(3679, "Sanjeet Kumar");
		map.put(3680, "Pramod Kumar Singh");
		map.put(3681, "Deepak Singh");
		map.put(3682, "Hari Bandhu Gauda");
		map.put(3683, "Kishor Dattu Mundhe");
		map.put(3674, "Ranjeet Sinha");
		map.put(3689, "Abhishek Khare");
		System.out.println("Size of Map is:" + map.size());
		System.out.println(map);
		if(map.containsKey("Sanjeet Kumar"))
		{
			String a=map.get("Sanjeet Kumar");
			System.out.println("\nValue for key"+"\"Sanjeet\"is:"+a);
			
		}
		else 
		{
			System.out.println("data not found");
		}
		
		if(map.containsKey(3678))
		{
			String b=map.get(3678);
			System.out.println("\nValue for key"+"\"Sanjeet\"is:"+b);
			
		}
		
	}

}
