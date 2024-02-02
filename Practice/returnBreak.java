public class returnBreak
{
	static void d()
	{
		for(int i=0;i<3; i++)
		{
			System.out.println(i);
			if(i==2)
			break;
		}
		System.out.println("Exited from the loop");
	}
	static void j()
	{
		for(int i=0;i<3; i++)
		{
			System.out.println(i);
			if(i==2)
			{
				System.out.println("Exited from the method");
				return;
			}
		}
	}
	public static void main(String []args)
	{
		d();
		j();
	}
}
