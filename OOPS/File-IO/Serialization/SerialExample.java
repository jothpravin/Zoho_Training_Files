import java.io.*;

class Num implements Serializable
{
	final transient static int i=3;
	final transient static int j=8;
}

public class SerialExample
{
	public static void main(String []args) throws Exception
	{
		Num n = new Num();
		
		FileOutputStream fos = new FileOutputStream("abc.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(n);
		System.out.println("Successfully Serialized");
		
		FileInputStream fis = new FileInputStream("abc.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Num o = (Num)ois.readObject();
		System.out.println("Successfully UnSerialized");
		System.out.println(o.i+" "+o.j);
		
	}
}
