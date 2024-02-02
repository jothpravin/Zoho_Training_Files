import java.io.*;

public class FileWriterEx
{
	public static void main(String []args) throws IOException
	{
		File f = new File("abc.txt");
		FileWriter fw = new FileWriter(f, true);
		fw.write(100);
		char ch[] = {'J','O','T','H','I'};
		fw.write(ch);
		fw.write(" Pravin");
		fw.flush();
		fw.close();
		FileReader fr = new FileReader(f);
		int i= fr.read();
		
		while(i!= -1)
		{
			System.out.println((char)i);
			i= fr.read();
		}
		
		char ch1[] = new char[(int)f.length()];
		fr.read(ch1);
		
		for(char c: ch1)
		{
			System.out.print(c);
		}
		
	}
}
