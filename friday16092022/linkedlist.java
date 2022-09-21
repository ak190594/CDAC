package friday16092022;

import java.util.LinkedList;

public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		INITIALIZE
		LinkedList<String> ll = new LinkedList<String>();
		
//		ADD ELEMENT
		ll.add("A");
		ll.add("B");
		ll.addLast("C");
		ll.addFirst("D");
		ll.add(2, "E");
		
		System.out.println(ll);
				
//		REPLACE ELEMENT
		
		ll.set(3, "K");
		System.out.println(ll);
		

//		REMOVE ELEMENT
		
//		ll.remove("B");
//		ll.remove(3);
		ll.removeFirst();
		ll.removeLast();

		System.out.println(ll);
		
		
//		ITERATE LINKED LIST
		for (int i = 0; i < ll.size(); i++) 
		{   
            System.out.print(ll.get(i) + " ");
        }
		
		
	}

}
