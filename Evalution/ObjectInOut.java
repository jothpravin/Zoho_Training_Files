import java.io.*;

public class ObjectInOut implements Serializable
{
	int a=10;
	int b=20;
	public static void main(String []args)
	{
		ObjectInOut obj = new ObjectInOut();
		User u = new User();
		
		try(FileOutputStream fos = new FileOutputStream("demo.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		)
		{
			FileInputStream fis = new FileInputStream("demo.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			System.out.println("Serialization");
			oos.writeObject(obj);
			oos.writeObject(u);
			System.out.println("Deserialization");
			ObjectInOut obj2 = (ObjectInOut)ois.readObject();
			User u1 = (User)ois.readObject();
			System.out.println(obj2.a+ " "+obj2.b);
			System.out.println(u1.name+ " "+u1.age+" "+u1.password);
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

class User extends ObjectInOut
{
	String name = "pravin";
	int age = 22;
	transient String password = "1234";
}
