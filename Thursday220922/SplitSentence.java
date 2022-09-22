package Thursday220922;

public class SplitSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "There are thirty-three big-apples";
		String [] splitString = (s.replaceAll("^[\\W+\\s+]", "").split ("[\\s!,?._'@-]+"));
		System.out.println(splitString.length);
        for (String string : splitString) 
        {
            System.out.println(string);
        }
	}

}
