public class ThreadExample implements Runnable
{
	@Override
	public void run()
	{
		try
		{
			for(int i=1; i<=10; i++)
			{
				System.out.println(i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static void main(String []args)
	{
		ThreadExample thread = new ThreadExample();
		Thread t = new Thread(thread);
		t.start();
	}
}
