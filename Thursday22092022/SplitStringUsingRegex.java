package Thursday22092022;

import java.util.Arrays;
import java.util.Scanner;

public class SplitStringUsingRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String source = "CDAC1FOR2DRDO";
		String[] parts = source.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");
		System.out.println(Arrays.toString(parts));
		

		
		
	}

}
