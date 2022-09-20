package collection;
import java.util.*;
public class Linkedlistfnl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			LinkedList<String> linkedList = new LinkedList<String>();
			linkedList.add("u");
			linkedList.add("n");
			linkedList.add("a");
			
			System.out.println("LinkedList" + linkedList);
			
			linkedList.addFirst("K");
			linkedList.addLast("L");
			
			System.out.println("Updated Linked List: " + linkedList);
	}

}
