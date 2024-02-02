class MyThread extends Thread
{
	public void run()
	{
		try
		{	
			for(int i=0;i<10;i++)
			{
				System.out.println("iamlazy thread");
				Thread.sleep(3000);
			}
		}
		catch (InterruptedException e)
		{
			System.out.println("i got interrupted");
		}
	}
}
class ThreadInterruptDemo1
{
	public static void main(String[] args)
	{
		MyThread t=new MyThread();
		t.start();
		t.interrupt();
		System.out.println("end of main thread");
	}
}
