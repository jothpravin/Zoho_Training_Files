import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
	static Scanner in = new Scanner(System.in);
	public static void main(String []args)
	{
	
		Shop shop = new Shop("Jai Stores ⭐️", "Srivi");
		
		shop.items.add(new Item("Kurukure", 10, 1));
		shop.items.add(new Item("Maza", 40, 1));
		shop.items.add(new Item("Maggie", 10, 1));
		shop.items.add(new Item("Britania", 10, 1));
		
		while(true)
		{
			System.out.print("<------------------------------------>\n");
			System.out.print("	  Invoice Management	\n");
			System.out.print("1.Add Customer\n2.Add Invoice\n3.Add Items\n4.List Customers\n5.List Invoices\n6.List Invoices of a Customer\n7.Detailed Invoice\n8.Exit\n");
			System.out.print("<------------------------------------>\n");
			System.out.print("Enter the option to perform: ");
			int n = in.nextInt();
			int m;
			switch(n)
			{
				case 1:
					System.out.print("Enter the customer name: ");
					String cusName = in.next();
					System.out.print("Enter the mobile name : ");
					long cusMobile = in.nextLong();
					shop.addCustomer(new Customer(cusName, cusMobile));
					break;
					
				case 2:
					System.out.println("Enter 1 to new Customer || enter any number to existing customer");
					int t = in.nextInt();
					ArrayList<Item> currItem = new ArrayList<>();
					if(t == 1)
					{
						System.out.print("Enter the customer name: ");
						String cusName1 = in.next();
						System.out.print("Enter the mobile name : ");
						long cusMobile1 = in.nextLong();
						Customer currCus = new Customer(cusName1, cusMobile1);
						shop.addCustomer(currCus);
						System.out.println("Successfully Customer created..");
						while(true)
						{
							shop.listItems();
							System.out.print("Enter 1 to add Items to Invoice || Any number to stop :");
							int o = in.nextInt();
							
							if(o==1)
							{
								System.out.print("Enter the items to add into invoice: ");
								int p = in.nextInt();
								System.out.print("Enter the item quanties: ");
								int b = in.nextInt();
								String curName = shop.getItem(p-1).getName();
								int curPrice = shop.getItem(p-1).getPrice();
								currItem.add(new Item(curName, curPrice, b));
							}
							else
							{
								break;
							}
						}
						if(!currItem.isEmpty())
						{
							Invoice currInvc = new Invoice(shop, currCus, currItem);
							shop.addInvocie(currInvc);
							currCus.addCusInvoice(currInvc);
							System.out.println("Successfully Invoice created..");
						}
						else
						{
							System.out.println("Unable to create invoice with 0 items");
						}
						
					}
					else
					{
						shop.listCustomers();
						System.out.print("Enter the customer id :");
						int id = in.nextInt();
						Customer curCustomer = shop.getCustomer(id);
						ArrayList<Item> currItem1 = new ArrayList<>();
						
						if(curCustomer!=null)
						{
							while(true)
							{
								shop.listItems();
								System.out.print("Enter 1 to add Items to Invoice || Any number to exit ");
								int o1 = in.nextInt();
								
								if(o1==1)
								{
									System.out.print("Enter the items to add into invoice: ");
									int p1 = in.nextInt();
									System.out.print("Enter the item quanties: ");
									int b1 = in.nextInt();
									String curName1 = shop.getItem(p1-1).getName();
									int curPrice1 = shop.getItem(p1-1).getPrice();
									currItem1.add(new Item(curName1, curPrice1, b1));
								}
								else
								{
									break;
								}
							}
							if(!currItem1.isEmpty())
							{
								Invoice currInvc1 = new Invoice(shop, curCustomer, currItem1);
								shop.addInvocie(currInvc1);
								curCustomer.addCusInvoice(currInvc1);
								System.out.println("Successfully Invoice created..");
							}
							else
							{
								System.out.println("Unable to create invoice with 0 items");
							}
						}
						else
						{
							System.out.println("Invalid Customer ID");
						}
						
					}
					break;
					
				case 3:
					do
					{
						System.out.print("Enter 1 to add item to shop or 2 to stop :");
						m = in.nextInt();
						if(m==1)
						{
							System.out.print("Enter the item name :");
							String iName = in.next();
							System.out.print("Enter the item price :");
							int iPrice = in.nextInt();
							System.out.print("Enter the Quantity :");
							int nos = in.nextInt();
							shop.addItems(new Item(iName, iPrice, nos));
							System.out.println("Successfully added..");
						}
						else
						{
							break;
						}
					}while(m==1);
					
					break;
				
				case 4:
					shop.listCustomers();
					break;
					
				case 5:
					shop.listInvoices();
					break;
					
				case 6:
					System.out.print("Enter the Customer Id to get Invoices: ");
					int cussId = in.nextInt();
					shop.customerInvoices(cussId);
					break;
					
				case 7:
					System.out.print("Enter the Invoice number :" );
					int inNo = in.nextInt();
					shop.printDetailedInvoice(inNo);
					break;
					
				case 8:
					System.out.println("Exiting...");
					System.exit(0);
				
				default:
					System.out.print("Enter the correct option to perform :");
			}
		}
	}
}
