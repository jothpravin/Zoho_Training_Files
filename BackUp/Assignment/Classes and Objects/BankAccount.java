public class BankAccount
{
	private int balance;
	private int accountNumber;
	private String accountType;
	
	public int getBalance()
	{
		return balance;
	}
	
	public int getAccountNumber()
	{
		return accountNumber;
	}
	
	public String getAccountType()
	{
		return accountType;
	}
	
	public void setBalance(int balance)
	{
		this.balance = balance;
	}
	
	public void setAccountNumber(int accountNumber)
	{
		this.accountNumber = accountNumber;
	}
	
	public void setAccountType(String accountType)
	{
		this.accountType = accountType;
	}
}
