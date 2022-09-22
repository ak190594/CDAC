package Thursday220922;

import java.util.Arrays;
public class SpilitStringUsingRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String source = "CDAC1FOR2DRDO";
		String[] parts = source.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)");
		System.out.println(Arrays.toString(parts));
	}

}
