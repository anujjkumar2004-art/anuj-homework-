class Bankaccount
{
	double balance;
	Bankaccount()
	{
		balance=1000;
	}
	
	void deposit(double amount)
	{
		balance = balance + amount;
		System.out.println("Amout Deposited...");
	}
	
	void withdraw(double amount)
	{
		if(amount <= balance) 
		{
            balance = balance - amount;
            System.out.println("Amount withdraw");
        } else 
		{
            System.out.println("Insufficient balance");
        }
	}
	
	void displayamount()
	{
		System.out.println("balance =" + balance);
	}
}