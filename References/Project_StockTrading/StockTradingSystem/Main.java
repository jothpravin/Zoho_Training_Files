package StockTradingSystem;

import java.util.Scanner;

public class Main 
{
    static Scanner in = new Scanner(System.in); 
    public static void main(String[] args) 
    {
        UserDAO userDAO = new UserDAO();
        UserController userController = new UserController(userDAO);
        TradingDAO tradingDAO = new TradingDAO();
        TradingController tradingController = new TradingController(tradingDAO); 
        while(true)
		{
			System.out.println("------------------------------------------------------");
			System.out.println("| Option |            Description                    |");
			System.out.println("------------------------------------------------------");
			System.out.println("|   1    | Login User                                |");
			System.out.println("|   2    | SignUp User                               |");
			System.out.println("|   3    | Exit                                      |");
			System.out.println("------------------------------------------------------");

			System.out.print("Enter the Option to perform :");	
			int n = in.nextInt();
			switch(n)
			{
				case 1:
                    int login = userController.login();
                    boolean logout = false;
                    if(login > 0)
                    {
                        System.out.println("Login Successfully as "+userController.getUserName(login));
                        while(!logout)
                        {
                            System.out.println("------------------------------------------------------");
                            System.out.println("| Option |            Description                    |");
                            System.out.println("------------------------------------------------------");
                            System.out.println("|   1    | Buy Stocks                                |");
                            System.out.println("|   2    | Sell Stocks                               |");
                            System.out.println("|   3    | Portfolio                                 |");
                            System.out.println("|   4    | Logout                                    |");
                            System.out.println("------------------------------------------------------");

                            System.out.print("Enter the Option to perform :");	
                            int m = in.nextInt();
                            switch(m)
                            {
                                case 1:
                                    tradingController.showStocks();
                                    break;

                                case 2:
                                    break;

                                case 3:
                                    break;

                                case 4:
                                    logout = userController.logout();
                                    break;
                            }
                        }
                    }
                    break;

                case 2:
                    userController.SignUp();
                    break;

                case 3:
					System.out.println("Application Exiting");
					System.exit(0);
                    break;
                
                default:
                    System.out.println("Enter the correct option to perform..");
                    break;
            }
        }
    }           
}    