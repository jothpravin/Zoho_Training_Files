import java.io.*;

class A implements Serializable
{
	B b = new B();
}
class B implements Serializable
{
	C c = new C();
}
class C implements Serializable
{
	int j=8;
}

public class ObjectGraph
{
	public static void main(String []args) throws Exception
	{
		
		FileOutputStream fos = new FileOutputStream("obj.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		A a = new A();
		oos.writeObject(a);
		System.out.println("Successfully Serialized");
		
		FileInputStream fis = new FileInputStream("obj.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		System.out.println("Successfully UnSerialized");
		System.out.println("Successfully implemented Object Graph");
		System.out.println(a.b.c.j);
		
	}
}
