package Thursday22092022;

import java.io.File;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			File f0 = new File("C:\\Users\\Kunal\\operationexample.txt");
			
			if (f0.createNewFile())
			{
				System.out.println("File "+f0.getName()+" is created");	
			}
			else {
				System.out.println("File already exists in the directory");
			}
			
			System.out.println("The absolute path of the file is "+f0.getAbsolutePath());

			System.out.println("Is File radable "+f0.canRead());

			f0.setReadOnly();
			
			f0.setWritable(true);

			
			System.out.println("Is File Writable "+ f0.canWrite());
			
			
			
		}
		catch (IOException exception)
		{
			System.out.println("An Unexpected error has occurred");
			exception.printStackTrace();
		}
		
		
		
	}
}