import java.io.*;

public class ByteArray
{
	public static void main(String []args) throws Exception
	{
		try(FileOutputStream fos1 = new FileOutputStream("demo.txt");
		FileOutputStream fos2 = new FileOutputStream("demo1.txt");
		ByteArrayOutputStream bout = new ByteArrayOutputStream();
		)
		{
			bout.write(77);
			bout.write(78);
			bout.write(79);
			bout.write(80);
			bout.writeTo(fos1);
			bout.writeTo(fos2);
			System.out.println("Success..");
		}
		
		catch(Exception e)
		{
			System.out.println("File Not Found");
		}
	}
}
