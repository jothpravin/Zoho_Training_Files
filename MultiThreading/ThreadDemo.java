class jo extends Thread
{
	public void run() 
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("Hi from jo");
			try{ Thread.sleep(1000);} catch(Exception e){}
		}
	}
}

class jai extends Thread 
{
	public void run() 
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("Hi from jai");
			try{ Thread.sleep(1000);} catch(Exception e){}
		}
	}
}

public class ThreadDemo
{
	public static void main(String []args) throws InterruptedException	
	{
		jo j = new jo();
		jai jj = new jai();
		Thread jaya = new Thread(() -> {
			for(int i=0; i<5; i++)
			{
				System.out.println("Hi from jaya");
				try{ Thread.sleep(1000);} catch(Exception e){}
			}
		}, "Jaya");
		
		Runnable r = new Runnable(){
			@Override
			public void run()
			{
				for(int i=0; i<5; i++)
				{
					System.out.println("Hi from ganesh");
					try{ Thread.sleep(1000);} catch(Exception e){}
				}
			}
		};
		
		Thread ganesh = new Thread(r, "Ganesh"); 
		
		
		
		j.setName("Jothi");
		jj.setName("Jainul");
		System.out.println(j.getName()+" ");
		System.out.println(jj.getName()+" ");
		System.out.println(jaya.getName()+" ");
		System.out.println(ganesh.getName()+" ");
		
		ganesh.start();
		ganesh.join();
		jaya.start();
		j.start();
		j.join();
		jj.start();
		//System.out.println(j.isAlive()+" 1");
		//System.out.println(jj.isAlive()+" 2");
	}
}
