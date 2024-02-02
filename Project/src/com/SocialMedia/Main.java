import java.util.Scanner;

public class Main
{
	static Scanner in = new Scanner(System.in);
	public static void main(String []args)
	{
		UserController uc = new UserController();
		while(true)
		{
			System.out.println("------------------------------------------------------");
			System.out.println("| Option |            Description                    |");
			System.out.println("------------------------------------------------------");
			System.out.println("|   1    | Login                                     |");
			System.out.println("|   2    | SignUp                                    |");
			System.out.println("|   3    | Exit                                      |");
			System.out.println("------------------------------------------------------");

			System.out.print("Enter the Option to perform :");	
			int n = in.nextInt();
			switch(n)
			{
				case 1:
					if(uc.login())
					{
						System.out.println("Successfully Login");
					}
					else
					{
						System.out.println("Invalid Crendentials");
					}
					while(true)
					{
						System.out.println("------------------------------------------------------");
						System.out.println("| Option |            Description                    |");
						System.out.println("------------------------------------------------------");
						System.out.println("|   1    |                                      |");
						System.out.println("|   2    | SignUp                                    |");
						System.out.println("|   3    | Exit                                      |");
						System.out.println("------------------------------------------------------");

						System.out.print("Enter the Option to perform :");	
						int n = in.nextInt();
						switch(n)
						{
							case 1:
								break;
						}
					}
					break;
					
				case 2:
					uc.signUp();
					break;
				
				case 3:
					System.out.println("Application Exiting");
					System.exit(0);
			}
		}
	}
}
