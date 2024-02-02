import java.io.*;

public class ImageRead
{
	public static void main(String []args)
	{
		try(FileInputStream source = new FileInputStream("/home/zoho/Downloads/Level1.pdf"); 
        		FileOutputStream target = new FileOutputStream("/home/zoho/jothipravin/L1.pdf"))
        		{
        			int temp;
        			while((temp = source.read()) != -1)
        			{
        				target.write(temp);
        			}
        			System.out.println("SuccesFully Coiped");
        		}
        	catch(IOException e)
        	{
        		System.out.println("File not found");
        	}
	}
}
