package Thursday220922;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class DuplicateFile {

	
	public static void main(String[] args)
	{
		try {

			// Creating a FileReader object and file to be read is passed as in parameters
			FileReader fr = new FileReader("C:\\Users\\dell\\FileOperationExample.txt");

			// Creating a FileWriter object
			FileWriter fw = new FileWriter("C:\\Users\\dell\\FileOperationExample1.txt");

			String str = "";

			int i;
			while ((i = fr.read()) != -1) {

				// Storing every character in the string
				str += (char)i;
			}

			System.out.println(str);

			
			fw.write(str);
			fr.close();
			fw.close();

			System.out.println("File reading and writing both done");
		}

		catch (IOException e) 
		{
			System.out.println("There are some IOException");
		}
	}
}
