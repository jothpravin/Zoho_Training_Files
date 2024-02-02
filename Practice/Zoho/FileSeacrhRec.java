import java.io.*;
import java.util.Scanner;

public class FileSeacrhRec
{
	public static void SearchFile(File [] files, String fName)
	{
		for(File f : files)
		{
			if(f.isDirectory())
			{
				//System.out.println("Directory :"+f.getName());
				SearchFile(f.listFiles(), fName);
			}
			
			else
			{
				//System.out.println("File :"+f.getName());
				if(f.getName().equals(fName))
				{
					try(FileInputStream fis = new FileInputStream(f);
					    FileOutputStream fos = new FileOutputStream("/home/zoho/jothipravin/OOPS/File-IO/dummy1.txt",true))
					{
						int ch = fis.read();
						
						while(ch != -1)
						{
							System.out.print((char)ch);
							fos.write(ch);
							ch = fis.read();
						}
					}
					catch(Exception e)
					{
						e.printStackTrace();
					}
					return;
				}
			}
		}
	}

	public static void main(String []args)
	{
		String path, targetFile;
		Scanner in = new Scanner(System.in);
		path = "/home/zoho/jothipravin/";
		targetFile = "abc.txt";
		
		File f = new File(path);
		
		SearchFile(f.listFiles(), targetFile);	
	}
}

