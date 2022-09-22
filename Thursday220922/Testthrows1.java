package Thursday220922;

import java.io.IOException;
class Testthrows1
{
	void m () throws IOException
	{
		throw new IOException("device error");//check exception
	}
		void n() throws IOException
		{
			m();
		}
			void p()
			{
				try
				{
					n();
				}
				catch (Exception e)
					{
						System.out.println("Exception handled");
					}
			}
	public static void main (String [] args) {
	
		Testthrows1 obj=new Testthrows1();
		obj.p();
		System.out.println("Normal flow.....");
	}
}