package Thursday22092022;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDuplicator {
	
	static String reader(File file) {
		
		StringBuffer sb=new StringBuffer();
		try  
		{  
			FileReader fr=new FileReader(file);   //reads the file  
			BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
			String line;  
			while((line=br.readLine())!=null)  
			{  
				sb.append(line);      //appends line to string buffer  
				sb.append("\n");     //line feed   
			}  
			fr.close();    //closes the stream and release the resources  
//			System.out.println("Contents of File: ");  
//			System.out.println(sb.toString());   //returns a string that textually represents the object  
			
		}  
		catch(IOException e)  
		{  
			e.printStackTrace();  
		} 
		
		return sb.toString();
	}
	
	static void writer (File file, String content) {
		try {
			
			FileWriter fwrite = new FileWriter(file);
			fwrite.write(content);
			fwrite.close();
			System.out.println("Success...");
		}
		catch(Exception e)
		{
		System.out.println("Unexpected error Occured");
		e.printStackTrace();
		}
	}
	
	static void create (File file)
	{
		try {
			if (file.createNewFile())
			{
				System.out.println("File "+file.getName()+" is created");	

			}
			else {
				System.out.println("File already exists in the directory");
				
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		File original_file=new File("C:\\Users\\Kunal\\operationexample.txt");    //creates a new file instance
		int flag=0;
		String content = new String();
		
		if (original_file.canRead())
		{
			content= reader(original_file);
			System.out.println(content);
			
			flag=1;
			
		}
		else
		{
			System.out.println("No read permission");
		}
		if (flag==1)
		{
			File duplicate_file = new File("C:\\Users\\Kunal\\operationexample2.txt");
			
			create(duplicate_file);
			
			writer(duplicate_file, content);
			
		}

		
		
		
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}
}
