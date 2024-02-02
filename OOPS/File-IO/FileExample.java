import java.io.*;

public class FileExample
{
	public static void main(String []args) throws IOException
	{
		File f = new File("ab.txt");
		System.out.println(f.exists());
		System.out.println(f.createNewFile());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.length());
		System.out.println(f.list());
	}
}
