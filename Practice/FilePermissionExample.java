import java.io.*;
import java.security.PermissionCollection;

public class FilePermissionExample
{
	public static void main(String []args)
	{
		try
		{
			String src = "/home/zoho/jothipravin/Assignment/-";
			FilePermission file1 = new FilePermission("/home/zoho/jothipravin/-", "read");
			PermissionCollection pc = file1.newPermissionCollection();
			pc.add(file1);
			FilePermission file2 = new FilePermission(src, "write");
			FilePermission file3 = new FilePermission(src, "execute");
			pc.add(file2);
			if(pc.implies(new FilePermission(src,"read, write, execute")))
			{
				System.out.println(src + ": Granted");
			}
			else
			{
				System.out.println(src +": Not Granted");
			}
			PermissionCollection newPC = new FilePermission("/home/zoho/jothipravin/-", "read").newPermissionCollection();
		      newPC.add(new FilePermission(src, "read"));
		      newPC.add(new FilePermission(src, "write"));

		      // Check if execute permission is still implied
		      if (newPC.implies(new FilePermission(src, "execute"))) {
		          System.out.println(src + ": Execute Permission Granted");
		      } else {
		          System.out.println(src + ": Execute Permission Not Granted");
		      }
		}
		catch(Exception e)
		{
			System.out.println("Error :"+e);
		}
	}
}
