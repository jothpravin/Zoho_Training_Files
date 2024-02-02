import java.io.*;
import java.util.*;

public class CSVReaderWriter
{
	public static void main(String []args) throws Exception
	{
		try(BufferedReader br = new BufferedReader(new FileReader("read.csv"));
			PrintWriter pw = new PrintWriter("write.csv"))
			{
				String line; 
				String bk=null;
				String[] columns=null;
				while((line = br.readLine()) != null)
				{
					bk = line;
					pw.append(bk);
					pw.append("\n");
					columns = line.split(",");
					
					System.out.println(Arrays.toString(columns));
				}
				
			}
			catch(Exception e)
			{
				System.out.println("File Not Found");
			}
	}
}
