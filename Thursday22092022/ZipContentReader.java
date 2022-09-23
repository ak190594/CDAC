package Thursday22092022;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ZipContentReader {

	public static void listContents(String fileName){
        ZipFile zipFile = null;
        File file = new File(fileName);
        try {
            zipFile = new ZipFile(file);
            List<String> fileContent = zipFile.stream().map(ZipEntry::getName).collect(Collectors.toList());
            System.out.println("ZipFile contents - " + fileContent);
            zipFile.close();
        }
        catch (IOException ioException) {
            System.out.println("Error opening zip file" + ioException);
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String fileName = ("C:\\Users\\Kunal\\OperationExample.Zip");
        listContents(fileName);
	}

}
