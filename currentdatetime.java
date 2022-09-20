import java.text.SimpleDateFormat;
import java.util.Date;

public class currentdatetime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat datetime = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date date = new Date();
		
		System.out.println(datetime.format(date));		
	}
}
