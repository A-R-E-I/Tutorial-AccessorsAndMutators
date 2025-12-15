package javaPack;

public class MainBank {

	public static void main(String[] args)
	{
		//object and constructor creation
		DisplayMain();
	}
	
	static void DisplayMain()
	{
		//Set the mutator to set the data 
		BankAccount myAccount = new BankAccount();
		myAccount.setAccountHolder("Toji");
		myAccount.setBalance(-10000000);
		
		System.out.println("User: " + myAccount.getAccountHolder());
		System.out.println("Balance: $" + myAccount.getBalance());
	}
}