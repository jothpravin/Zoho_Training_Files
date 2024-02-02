import java.io.*;

public class InputStreamExample
{
	public static void main(String []args) throws IOException
	{
		FileInputStream fis1 = new FileInputStream("dummy.txt");
		FileInputStream fis2 = new FileInputStream("dummy1.txt");
		
		SequenceInputStream fis3 = new SequenceInputStream(fis1, fis2);
		
		int value = fis3.read();
		
		System.out.println(fis1.available());
		System.out.println(fis2.available());
		while(value != -1)
		{
			System.out.print((char)value);
			value = fis3.read();
		}
	}
}
