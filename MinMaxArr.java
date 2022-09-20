package collection;
import java.util.ArrayList;

public class MinMaxArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			ArrayList<Integer> arr= new ArrayList<>();
			arr.add(10);
			arr.add(78);
			arr.add(90);
			arr.add(67);
			arr.add(45);
			arr.add(28);
			int min = arr.get(0);
			int max = arr.get(0);
			int n = arr.size();
			
			
			for (int i = 1; i < n; i++) {
	            if (arr.get(i) < min) {
	                min = arr.get(i);
	            }
			}
			
			for (int i = 1; i < n; i++) {
	            if (arr.get(i) > max) {
	                max = arr.get(i);
	            }
			}
	                
	                System.out.println("Maximum value of an array is:\t"+max);
	                System.out.println("Minimum value of an array is:\t"+min);
	}

}
