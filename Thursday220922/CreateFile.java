package Thursday220922;
// Import File class
import java.io.File;
import java.io.IOException;
//Importing the IOException class for handling errors
public class CreateFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			//Creating an object of file
			File fO = new File("C:\\Users\\dell\\FileOperationExample.txt");
			if(fO.createNewFile())
			{
				System.out.println("File"+ fO.getName() + "is craeted successfully");
			}else 
			{
				System.out.println("File is already exist in the directory");
			}
		}catch(IOException e)
		{
			System.out.println("An unexpected error is occured");
			e.printStackTrace();
		}
		

}
}
