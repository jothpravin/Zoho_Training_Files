import java.io.*;

public class PrintWriterEx
{
	public static void main(String []args) throws IOException
	{
		File f = new File("abc.txt");
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(f, true)));
		pw.write(97);
		char ch[] = {'J','O','T','H','I'};
		pw.write(ch);
		pw.println(" PRAVIN");
		pw.println(100);
		pw.println(3.7);
		pw.print('J');
		pw.println('J');
		pw.println(true);
		pw.print("Length: "+f.length());
		pw.flush();
		pw.close();
		BufferedReader br = new BufferedReader(new FileReader(f));
		//int i= br.read();
		
		/*while(i!= -1)
		{
			System.out.print((char)i);
			i= br.read();
		}
		
		char ch1[] = new char[(int)f.length()];
		br.read(ch1);
		
		for(char c: ch1)
		{
			System.out.print(c);
		}*/
		
		String line = br.readLine();
		
		while(line!= null)
		{
			System.out.println(line);
			line = br.readLine();
		}
		
	}
}
