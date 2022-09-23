package Thursday22092022;
import java.io.File;
import java.io.FileWriter;

public class WriteToFile {
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		try {
			
//			File f0 = new File("C:\\Users\\Kunal\\operationexample.txt");

			FileWriter fwrite = new FileWriter("C:\\users\\kunal\\OperationExample.txt");
			
			
			fwrite.write("A named location used to store related information is referred to as a File.");
			fwrite.close();
			System.out.println("Success...");
		}
		catch(Exception e)
		{
		System.out.println("Unexpected error Occured");
		e.printStackTrace();
		}    
        
	}
}