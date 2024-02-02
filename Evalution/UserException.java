class UDException extends Exception
{
	public UDException(String s)
	{
		super(s);
	}
}

public class UserException
{
	public static void main(String []args)
	{
		try
		{
			throw new UDException("Custom Exception");
		}
		catch(UDException e)
		{
			System.out.println("Caughted..");
		}
	}

}
