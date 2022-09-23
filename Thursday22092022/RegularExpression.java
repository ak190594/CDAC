package Thursday22092022;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern p = Pattern.compile(".s");
		Matcher m =p.matcher("as");
		boolean b = m.matches();
		
		boolean b2 = Pattern.compile(".s").matcher("as").matches();
		
		boolean b3 = Pattern.matches(".s", "as");
		
		
		System.out.println(b+"\n"+b2+"\n"+b3);
		
		System.out.println(Pattern.matches(".s","as"));
		System.out.println(Pattern.matches(".s","mk"));
		System.out.println(Pattern.matches(".s","mst"));
		System.out.println(Pattern.matches(".s","amms"));
		System.out.println(Pattern.matches("..s","mas"));

		try {
			System.out.println(InetAddress.getLocalHost());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("?quantifier");
		System.out.println(Pattern.matches("[amn]?","a"));
		System.out.println(Pattern.matches("[amn]?","aaa"));
		System.out.println(Pattern.matches("[amn]?","aammmmmss"));
		System.out.println(Pattern.matches("[amn]?","aazzta"));
		System.out.println(Pattern.matches("[amn]?","am"));
		System.out.println("+quantifier");
		System.out.println(Pattern.matches("[amn]+","a"));
		System.out.println(Pattern.matches("[amn]+","aaaa"));
		System.out.println(Pattern.matches("[amn]+","aammmnn"));
		System.out.println(Pattern.matches("[amn]+","aazzta"));
		System.out.println("*quantifier");
		System.out.println(Pattern.matches("[amn]*","ammna"));

		System.out.println();
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","arun32"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","kkvarun32"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","JA2Uk2"));
		System.out.println(Pattern.matches("[a-zA-Z0-9]{6}","arun$2"));

		
		
	}

}
