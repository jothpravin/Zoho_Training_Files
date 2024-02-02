import java.io.*;

public class BufferWriterEx
{
	public static void main(String []args) throws IOException
	{
		File f = new File("abc.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		bw.write(97);
		bw.newLine();
		char ch[] = {'J','O','T','H','I'};
		bw.write(ch);
		bw.write(" PRAVIN");
		bw.newLine();
		bw.flush();
		bw.close();
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
