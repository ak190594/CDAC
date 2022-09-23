package Thursday22092022;
import java.io.IOException;


public class ExceptionHandling {
	
	void m()throws IOException{
		throw new IOException("device error");	
	}
	
	void n()throws IOException{
		m();	
	}
	
	void p() {
		try {
			n();
		}
		catch(Exception e) {
			System.out.println("Exception Handled");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExceptionHandling obj =new ExceptionHandling();
		
		obj.p();
		System.out.println("Normal Flow");

	}

}
