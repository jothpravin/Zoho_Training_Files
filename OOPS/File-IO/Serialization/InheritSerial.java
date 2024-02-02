import java.io.*;

class Animal 
{
	int i=3;
}

class Dog extends Animal implements Serializable
{
	int j=8;
}

public class InheritSerial
{
	public static void main(String []args) throws Exception
	{
		Dog d1 = new Dog();
		d1.i=200;
		d1.j=100;
		
		FileOutputStream fos = new FileOutputStream("inher.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		System.out.println("Successfully Serialized");
		
		FileInputStream fis = new FileInputStream("inher.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog o = (Dog)ois.readObject();
		System.out.println("Successfully UnSerialized");
		System.out.println(o.i+" "+o.j);
		
	}
}
