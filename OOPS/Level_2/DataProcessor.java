import java.util.Date;

class DataProcessor
{
	private static final int MaxCampaign = 100;
	private static final int MaxDonator = 100;
	
	Campaign[] cam;
	int campaignCount;
	Donator[] don;
	int donatorCount;
	
	DataProcessor()
	{
		cam = new Campaign[MaxCampaign];
		campaignCount=0;
		don = new Donator[MaxDonator];
		donatorCount=0;
	}
	
	public Campaign[] getCampaign()
	{
		return cam;
	}
	
	public Donator[] getDonator()
	{
		return don;
	}
	
	public void ongoingCampaign()
	{
		Date currentDate = new Date();
		Campaign[] oc = cam;
		int count=0;
		for(Campaign ca : oc)
		{
			if(ca!=null)
			{
				if(currentDate.after(ca.getLanuchDate()) && currentDate.before(ca.getFundraiserDeadline()))
				{
					System.out.println(ca.getCampaignName()+" ");
				}
			}
		}
	}
	
	public void CompletedCampaign()
	{
		Date currentDate = new Date();
		Campaign[] cc = cam;
		int count=0;
		for(Campaign ci : cc)
		{
			if(ci!=null)
			{
				if(currentDate.after(ci.getFundraiserDeadline()))
				{
					System.out.println(ci.getCampaignName()+" ");
				}
			}
		}
	}
	
	public void addCampaign(Campaign campaign)
	{
		if(campaignCount<MaxCampaign)
		{
			cam[campaignCount++] = campaign;
		}
		else
		{
			System.out.println("Maximum campaigns reached");
		}
	}
	
	public void addDonation(Donator donator)
	{
		if(donatorCount<MaxDonator)
		{
			don[donatorCount++] = donator;
		}
		else
		{
			System.out.println("Maximum Donators reached");
		}
	}
	
	public void listCampaigns()
	{
		int count=0;
		for(Campaign c: cam)
		{
			if(c!=null)
			{	
				count++;
				System.out.println(c.toString());
				System.out.println("<---------------->");
			}
		}
		if(count==0)
		{
			System.out.println("There is no campaigns");
		}
	}
	
	public void getSingleCampaigns(String campaign)
	{
		int count=0;
		for(Campaign c: cam)
		{
			if(c!=null)
			{
				if(c.getCampaignName().equals(campaign))
				{
					count++;
					System.out.println(c.toString());
					System.out.println("<---------------->");
				}
			}
		}
		if(count==0)
		{
			System.out.println("There is no campaigns");
		}
	}
	
	public void listDonators()
	{		
		int count = 0;
		for(Donator d: don)
		{
			if(d!=null)
			{	
				count++;
				System.out.println(d.toString());
				System.out.println("<---------------->");
			}
		}
		if(count==0)
		{
			System.out.println("There is no Donators");
		}
	}
	
	public void listDonatorsForCampaign(String campaignName)
	{
		System.out.println("Donators for Campaign: "+campaignName);
		System.out.println("-----------------------------------------------------");
		for(int i=0; i<donatorCount; i++)
		{
			if(don[i].getCampaign().equals(campaignName))
			{
				System.out.println("* "+don[i].getContributorName()+" - Amount Donated-> "+don[i].getAmount());
			}
		}
		System.out.println("-----------------------------------------------------");
	}
	
	public void listCampaignsForDonator(String donatorName)
	{
		System.out.println("Campaigns for Donator: "+donatorName);
		System.out.println("-----------------------------------------------------");
		for(int i=0; i<campaignCount; i++)
		{
			for(int j=0; j<donatorCount; j++)
			{
				if(don[j].getCampaign().equals(cam[i].getCampaignName()) && don[j].getContributorName().equals(donatorName))
				{
					System.out.println("* "+cam[i].getCampaignName()+" - Amount Donated-> "+don[j].getAmount()+" USD - Payment Date: "+don[j].getPaymentDate());
				}
					
			}
		}	
		System.out.println("------------------------------------------------------");
	}
	
	
}
