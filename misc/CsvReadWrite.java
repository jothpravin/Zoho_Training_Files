import java.io.*;

public class CsvReadWrite
{
	public static void main(String []args)
	{
		try(BufferedReader br = new BufferedReader(new FileReader("/home/zoho/jothipravin/Zoho_Training_Files/misc/write.csv"));
			PrintWriter pw = new PrintWriter("/home/zoho/jothipravin/Zoho_Training_Files/misc/newcopy1.csv"))
		{
			String line;
			while((line = br.readLine()) != null)
			{
				pw.println(line);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
