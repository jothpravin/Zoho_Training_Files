import java.util.Hashtable;
import java.util.Enumeration;

public class DemoHash
{
	public static void main(String []args)
	{
		Hashtable<String, Integer> ht = new Hashtable<>(10);
		ht.put("pravin", 3);
		ht.put("ganesh", 1);
		ht.put("jaya", 2);
		ht.put("meena", 4);
		ht.put("jai", 3);
		ht.put("mubai", 1);
		ht.put("mohi", 2);
		ht.put("banu", 4);
		
		System.out.println(ht);
		
		Enumeration <String> keys = ht.keys();
		while(keys.hasMoreElements())
		{
			String key = keys.nextElement();
			System.out.println("Key :"+ key +", Value :"+ht.get(key));
		}
	}
}
