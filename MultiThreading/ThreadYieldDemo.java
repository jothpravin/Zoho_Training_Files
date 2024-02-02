class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("child thread->>>>>>>");
			Thread.yield();
		}
	}
}

class MyThread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("child1 thread----------");
			Thread.yield();
		}
	}
}

class ThreadYieldDemo
{
	public static void main(String[] args) throws Exception
	{
		MyThread t=new MyThread();
		MyThread1 t1=new MyThread1();
		t1.setPriority(10);
		t1.start();
		t1.join();
		t.start();
		//Thread.currentThread().setPriority(1);
		//Thread.sleep(1000);
		for(int i=0;i<5000;i++)
		{
			System.out.println("main thread");
		}
	}
}
