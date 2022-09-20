package collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ConvertListArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int size;
			String str;
			List <Character> charList = new ArrayList<Character>();
			
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Enter size of char list");
			
			size=sc.nextInt();
			
			for(int i=0;i<size;i++)
			{
				System.out.println("Enter char ["+i+"]:");
				charList.add(sc.next().charAt(0));
				
			}
			sc.close();
			
			System.out.println("List"+ charList);
			
			StringBuilder builder = new StringBuilder();
			
			for(Character  ch: charList)
			{
				builder.append(ch);
			}
			
			str = builder.toString();
			
			System.out.println("String after converting List" + str);
			
	}

}
