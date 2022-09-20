package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrListRev {
	public static void main(String[] args) {
		List<String> I=new ArrayList<String>();
		I.add("Mango");
		I.add("Banana");
		I.add("Guava");
		I.add("Grapes");
		I.add("Litchi");
		I.add("Strawberry");
		I.add("Blackberry");
		I.add("Apple");
		System.out.println("Before Reversing");
		System.out.println(I.toString());
		Collections.reverse(I);
		System.out.println("After Reversing");
		System.out.println(I);
		
	}

}
