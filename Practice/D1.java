public class D1
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World");
		if(args.length > 0)
		{
			for(String a: args)
			{
				System.out.println(a);
			}
		}
	}
}
