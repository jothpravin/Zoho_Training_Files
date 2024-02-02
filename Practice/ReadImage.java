import java.io.*;
import java.util.*;

public class ReadImage
{
	public static void main(String []args) throws Exception
	{
		try(FileInputStream fis = new FileInputStream("/home/zoho/Downloads/images.jpeg");
			FileOutputStream fos = new FileOutputStream("/home/zoho/jothipravin/jai.jpeg"))
			{
				int temp; 
				while((temp = fis.read()) != -1)
				{
					fos.write(temp);
				}
				
			}
			catch(Exception e)
			{
				System.out.println("File Not Found");
			}
	}
}
