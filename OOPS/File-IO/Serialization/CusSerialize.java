import java.io.*;

class Account implements Serializable
{
	String name = "Pravin";
	transient String pwd = "Jain";
	transient int pin = 8722;
	
	private void writeObject(ObjectOutputStream os) throws Exception
	{
		os.defaultWriteObject();
		String epwd = "123"+pwd;
		os.writeObject(epwd);
		int ePin = 8744 + 1234; 
		os.writeInt(ePin);
	}
	private void readObject(ObjectInputStream is) throws Exception
	{
		is.defaultReadObject();
		String epwd = (String)is.readObject();
		pwd = epwd.substring(3);
		int ePin = (int)is.readInt();
		pin = ePin - 1234;
	}
}

public class CusSerialize
{
	public static void main(String []args) throws Exception
	{
		Account n = new Account();
		
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(n);
		System.out.println("Successfully Serialized");
		
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account o = (Account)ois.readObject();
		System.out.println("Successfully UnSerialized");
		System.out.println(o.name+" "+o.pwd+" "+o.pin);
		
	}
}
