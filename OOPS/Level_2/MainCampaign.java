import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class MainCampaign
{
	public static void main(String []args) throws ParseException
	{
		int choose=0;
		Scanner obj = new Scanner(System.in);
		DataProcessor dp = new DataProcessor();
		SimpleDateFormat fDate = new SimpleDateFormat("dd/MM/yyyy");
		
		while(true)
		{
			System.out.println("--------------|Menu|--------------");
			System.out.println("|1.Add Campaign                  |\n|2.Add Donators                  |\n|3.List Campaigns                |\n|4.List Donators                 |\n|5.Donator Lists For Campaign    |\n|6.Campaign Lists For Donator    |\n|7.Completed campagins           |\n|8.Ongoing campagins             |\n|9.Exit                          |");
			System.out.println("----------------------------------");
			System.out.print("Pick an Option: ");
			try
			{
				choose = obj.nextInt();
			}
			catch(Exception e)
			{
				System.out.println("Only numbers allowed");
				System.exit(0);
			}
			
			switch(choose)
			{
				case 1:
					String s4="";
					Date dDate = new Date();
					System.out.print("Enter the Owner: ");
					String s1 = obj.next();
					System.out.print("Enter the Campaign Name: ");
					String s2 = obj.next();
					System.out.print("Enter the Launch Date - like this dd/MM/yyyy :");
					String s3 = obj.next();
					Date lDate = fDate.parse(s3);
					System.out.print("Enter the DeadLine Date - like this dd/MM/yyyy: ");
				 	s4 = obj.next();
					dDate = fDate.parse(s4);
					if(dDate.before(lDate))
					{
						while(true)
						{		
							System.out.println("You cannot enter date of before launch date");
							System.out.print("Enter the DeadLine Date - like this dd/MM/yyyy: ");
							s4 = obj.next();				
							dDate = fDate.parse(s4);
							if(!dDate.before(lDate))
							{
								break;
							}
						}
					}
					System.out.print("Enter the Fund Raising goal: ");
					double d = obj.nextDouble();
					obj.nextLine(); 
					System.out.print("Enter the Description for campaign: ");
					String s5 = obj.nextLine();
					System.out.print("Enter the Events : ");
					String s6 = obj.nextLine();
					
					Campaign campaign = new Campaign(s1, s2, lDate, dDate, d, s5, s6);
					
					Date currentDate = new Date();
					if(currentDate.after(lDate))
					{
						campaign.setStatus("Running");
					}
					dp.addCampaign(campaign);
					System.out.println("Campaign Sucessfully Created");
					break;
				
				case 2:
					System.out.println("<=====Campaign Names====>");
					int i=1,count=0;
					int choice;
					String s11="";
					Campaign []cl = dp.getCampaign();
					for(int j=0 ; j<dp.getCampaign().length; j++) 	 //Print all campaigns names
					{
						if(cl[j]!=null)
						{
							System.out.println((i++)+"."+cl[j].getCampaignName()+" - Status: "+cl[j].getStatus());
							count++;
						}
					}
					
					if(count!=0)
					{
						System.out.println("<----Choose the campaign---->");
						System.out.print("Enter Number: ");
						Campaign[] cn = dp.getCampaign();
						choice = obj.nextInt()-1;
						if(choice<count)	//Handle the input from user
						{
							s11 = cn[choice].getCampaignName();
							System.out.println("---/--Campaign-Details--/---");
							dp.getSingleCampaigns(s11);
						}
						else
						{
							while(true)
							{
								System.out.print("Enter the correct option: ");
								choice = obj.nextInt()-1;
								if(choice<count)
								{
									s11 = cn[choice].getCampaignName();
									System.out.println("---/--Campaign-Details--/---");
									dp.getSingleCampaigns(s11);
									break;	
								}
							}
						}
						System.out.print("Enter the Contributor Name: ");
						String s10 = obj.next();
						
						System.out.print("Enter the Payment Method: ");
						String s12 = obj.next();
						System.out.print("Enter the Description: ");
						String s13 = obj.next();
						System.out.print("Enter the Email ID: ");
						String s14 = obj.next();
						System.out.print("Enter the Donation amount: ");
						double d1 = obj.nextDouble();
						System.out.print("Enter the Payment Date - like this dd/MM/yyyy: ");
						String s15 = obj.next();
						Date pDate = fDate.parse(s15);
						
						boolean validDate = false;
						
						for(Campaign c : dp.getCampaign())	//Date validate
						{
							if(c!=null && c.getCampaignName()!=null)
							{
								if(c.getCampaignName().equals(s11))
								{
									Date lanuch = c.getLanuchDate();
									Date deadLine = c.getFundraiserDeadline();
									
									if(pDate.after(lanuch) && pDate.before(deadLine))
									{
										c.addAmount(d1);
										validDate = true;
										break;
									}
								}
							}
						}
						
						if(validDate)		
						{
							Campaign cf[] = dp.getCampaign();
							if(cf[choice].getFundraisingGoal()>cf[choice].getAmountRaised())
							{
								Donator donator = new Donator(s10, s11, s12, s13, s14, d1, pDate);
								dp.addDonation(donator);
								System.out.println("Donation is successfully Credited");
								break;
							}
							else
							{
								int temp;
								System.out.println("Fund goal is reached.");
								System.out.print("Anyway you want to add donation to campaign press=1 or press=2 to donate to different campaign :");
								temp = obj.nextInt();
								if(temp==1)
								{
									Donator donator = new Donator(s10, s11, s12, s13, s14, d1, pDate);
									dp.addDonation(donator);
									System.out.println("Donation is successfully Credited");
									break;
								}
								else
								{
									break;
								}
							}
						}
						else
						{
							System.out.println("Campaign has ended, you can donate some other campaign");
							break;
						}
					}
					else
					{
						System.out.println("There is no Campaign");
					}
				
				case 3:
					System.out.println("=====>Campaigns List<=====");		//Campaigns List
					dp.listCampaigns();
					break;
					
				case 4:
					System.out.println("=====>Donators List<=====");		//Donators List
					dp.listDonators();
					break;
				
				case 5:
					System.out.println("=========>Donators List For Campaign<=========");  		//Donators List For Campaign
					System.out.println("Campaign Names: Pick one to print all donators");
					int k=1,count1=0;
					Campaign []camN = dp.getCampaign();
					for(int j=0 ; j<dp.campaignCount; j++)     //List the comapaigns
					{
						System.out.println((k++)+"."+camN[j].getCampaignName());
						count1++;
					}
					if(count1==0)
					{
						System.out.println("There is no campaign till now");
						break;
					}
					System.out.println("<----Choose the Campaign---->");
					System.out.print("Enter Number: ");
					int choice1 = obj.nextInt()-1;
					if(choice1<count1)								//Handle the input from user
					{
						String camName = camN[choice1].getCampaignName();
						dp.listDonatorsForCampaign(camName);
						break;
					}
					else
					{
						while(true)
						{
							System.out.print("Enter the correct option: ");
							choice1 = obj.nextInt()-1;
							if(choice1<count1)
							{
								String camName = camN[choice1].getCampaignName();
								dp.listDonatorsForCampaign(camName);
								break;
							}
						}
					}
					
				case 6:
					System.out.println("=============>Campaign Lists For Donator<==============");  		//Campaigns List For Donator
					System.out.println("Donators Names: Pick one to print all donated Campaigns");
					int l=1, count2=0;
					Donator[] donN = dp.getDonator();
					for(int m=0 ; m<dp.donatorCount; m++)     //List the Donators
					{
						System.out.println((l++)+"."+donN[m].getContributorName());
						count2++;
					}
					if(count2==0)
					{
						System.out.println("There is no Donator till now");
						break;
					}
					System.out.println("<----Choose the Donator----->");
					System.out.print("Enter Number: ");
					int choice2 = obj.nextInt()-1;
					
					if(choice2<count2)								//Handle the input from user
					{
						String donName = donN[choice2].getContributorName();
						dp.listCampaignsForDonator(donName);
						break;
					}
					else
					{
						while(true)
						{
							System.out.print("Enter Number: ");
							choice2 = obj.nextInt()-1;
							if(count2>choice2)
							{
								String donName = donN[choice2].getContributorName();
								dp.listCampaignsForDonator(donName);
								break;
							}
						}
					}
					
				case 7:
					System.out.println("=============>Completed campagins<==============");
					dp.CompletedCampaign();
					break;
					
				case 8:
					System.out.println("=============>Ongoing campagins<==============");
					dp.ongoingCampaign();
					break;  
				
				case 9:
					System.out.println("Program exited..");
					System.exit(0);
					
				default :
					System.out.println("Invalid Options");
					break;
			}
		}
	}
}
