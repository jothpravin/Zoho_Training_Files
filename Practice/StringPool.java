public class StringPool
{
	static void methodA()
	{
		String a = new String("a");
		String b = new String("a");
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
	}
	
	static void methodB()
	{
		String a = new String("b");
		String b = new String("b");
		System.out.println(a==b);
		System.out.println(a.equals(b));
	}
	
	public static void main(String []args)
	{
		System.out.println("Method A");
		methodA();
		System.out.println("Method B");
		methodB();
	}
}
