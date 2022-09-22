package Thursday220922;
//import File class
import java.io.File;
	class FileInfo 
	{
		public static void main(String[] args) 
		{
		// TODO Auto-generated method stub
			//creating file object
			File fO = new File ("C:\\Users\\dell\\FileOperationExample.txt");
			if(fO.exists())
			{
				//getting file name
				System.out.println("the name of the file is:" + fO.getName());
				
				// getting path of the file
				System.out.println("The absolute path of the file is:" + fO.getAbsolutePath());
				
				//checking weather the file writeable or not
				System.out.println("Is file writeable?:" + fO.canWrite());
				
				//checking weather the file is readable or not
				System.out.println("Is file is readable" + fO.canRead());
				
				//getting the length of the files in bytes
				System.out.println("The size of the file in bytes is: " + fO.length());    
	        } 
			else 
			{  
	            System.out.println("The file does not exist.");  
			}
		}

	}
