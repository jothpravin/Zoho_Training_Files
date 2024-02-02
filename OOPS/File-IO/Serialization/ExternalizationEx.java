import java.io.*;

public class ExternalizationEx implements Externalizable 
{
	String s;
	int i;
	int j;
	public ExternalizationEx()
	{
		System.out.println("No-arg constructor called");
	}
	ExternalizationEx(String s, int i, int j)
	{
		this.s = s;
		this.i = i;
		this.j = j;
	}
	public void writeExternal(ObjectOutput out) throws IOException
	{
		out.writeObject(s);
		out.writeInt(i);
	}
	
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException
	{
		s = (String)in.readObject();
		i = in.readInt();
	}
	
	public static void main(String []args) throws Exception
	{
		System.out.println("Externalization Started");
		ExternalizationEx ex = new ExternalizationEx("Pravin", 3, 8);
		FileOutputStream fos = new FileOutputStream("Exser.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(ex);
		
		System.out.println("DeExternalization Started");
		FileInputStream fis = new FileInputStream("Exser.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ExternalizationEx ex1 = (ExternalizationEx)ois.readObject();
		System.out.println(ex1.s+" "+ex1.i+" "+ex1.j);
	}
}
