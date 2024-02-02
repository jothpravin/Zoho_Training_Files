class MyCustomException extends Exception
{
	MyCustomException(String str)
	{
		super(str);
	}
}
class Test
{
	public static void main(String []args) throws MyCustomException
	{
		int a=10;
		try
		{
			System.out.print("Exited..");
			System.exit(0);
			throw new MyCustomException(" ");
		}
		catch(MyCustomException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally this code run ");
		}
		
	}
}
