class B 
{
	private String owner;
	private int accountNumber;
	private int balance;
	
	B(String owner, int accountNumber, int balance)
	{
		this.owner = owner;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String getOwner()
	{
		return owner;
	}
	
	private int getAccountNumber()
	{
		return accountNumber;
	}
	
	public int getBalance()
	{
		return balance;
	}
	
	private void setOwner(String owner)
	{
		this.owner = owner;
	}
	
	private void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	
	public void setBalance(int balance)
	{
		this.balance = balance;
	}
}
public class BankAccount
{
	public static void main(String[] args)
	{
		B p1 = new B("JothiPravin", 22342, 300000);
		B p2 = new B("Jainul", 21213, 600000);
		
		System.out.println(p1.getOwner()+"'s Balance: "+p1.getBalance());
		System.out.println(p2.getOwner()+"'s Balance: "+p2.getBalance());
	}
}
