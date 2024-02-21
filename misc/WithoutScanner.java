import java.io.*;

public class WithoutScanner
{
	public static void main(String []args)
	{
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
		{
			String consoleInput = br.readLine();
			System.out.println("Readed input from console without Scanner :"+consoleInput);
			Console con = System.console();
			System.out.print("Enter the String :");
			String name = con.readLine();
			con.writer().println(name);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
