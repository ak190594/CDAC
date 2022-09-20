import java.util.*;
import java.io.*;
public class NOtepad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime rs = Runtime.getRuntime();
		try {
			rs.exec("photos");
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}