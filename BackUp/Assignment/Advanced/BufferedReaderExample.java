import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;


public class BufferedReaderExample
{
	public static void main(String []args)
	{
		String fileName = "input.txt";
		ArrayList<String> al = new ArrayList<>();
		try(BufferedReader reader = new BufferedReader(new FileReader(fileName)))
		{
			String line;
			while((line = reader.readLine()) != null)
			{
				al.add(line);
			}
			Iterator it = al.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}
		catch(IOException e)
		{
			System.out.println("Error reading the file :"+e.getMessage());
		}
	}
}
