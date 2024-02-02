import java.io.*;

public class ExampleFile
{
	public static void main(String []args) throws IOException
	{ 
		try(FileInputStream source = new FileInputStream("tamil.txt"); 
        		FileOutputStream target = new FileOutputStream("target.txt", true))
        		{
        			int temp;
        			while((temp = source.read()) != -1)
        			{
        				target.write((char)temp);
        			}
        			System.out.println("SuccesFully Coiped");
        		}
        	catch(IOException e)
        	{
        		System.out.println("File not found");
        	}
	}
}
