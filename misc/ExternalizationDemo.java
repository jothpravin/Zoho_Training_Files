import java.io.*;

public class ExternalizationDemo implements Externalizable
{
	String name;
	int age;
	int id;
	
	public ExternalizationDemo()
	{
		System.out.println("No arg constructor");
	}
	
	public ExternalizationDemo(String name, int age, int id)
	{
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	public void writeExternal(ObjectOutput out) throws IOException
	{
		out.writeObject(name);
		out.writeInt(age);
	}
	
	public void readExternal(ObjectInput in) throws IOException,ClassNotFoundException
	{
		name = (String) in.readObject();
		age = (int) in.readInt();
	}
	
	public String toString()
	{
		return "name :"+name+" age :"+age+" id :"+id;
	}
	
	public static void main(String []args) throws Exception
	{
		ExternalizationDemo exd = new ExternalizationDemo("pravin", 22, 1);
		System.out.println(exd);
		FileOutputStream fos = new FileOutputStream("demo.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(exd);
		FileInputStream fis = new FileInputStream("demo.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ExternalizationDemo ex = (ExternalizationDemo) ois.readObject();
		System.out.println(ex);
	}
}
