import java.io.*;

public class ObjectInOut implements Serializable
{
	int a=10;
	int b=20;
	public static void main(String []args)
	{
		ObjectInOut obj = new ObjectInOut();
		User
		
		try(FileOutputStream fos = new FileOutputStream("demo.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		)
		{
			FileInputStream fis = new FileInputStream("demo.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			System.out.println("Serialization");
			oos.writeObject(obj);
			System.out.println("Deserialization");
			ObjectInOut obj2 = (ObjectInOut)ois.readObject();
			System.out.println(obj2.a+ " "+obj2.b);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class User
{
	String name = "pravin";
	int age = 22;
	transient String password = "1234";
}
