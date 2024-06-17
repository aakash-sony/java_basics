interface Bank
{
	void deposit(int amount);
	void withdraw(int amount);
}
class Customer implements Bank
{
	protected double balance = 10000;
	@Override
	public void deposit(int amount) 
	{
		if(amount <=0)
		{
			System.err.println("Amount can't be deposited");
		}
		else
		{
			this.balance = this.balance + amount;
			System.out.println("Amount after deposit :"+this.balance);
		}
	}

	@Override
	public void withdraw(int amount) 
	{
		if(amount > balance)
		{
			System.err.println("Withdraw is not possible, Insufficient Balance");
		}
		else
		{
			this.balance = this.balance - amount;
			System.out.println("Amount after withdraw is :"+this.balance);
		}
		
	}	
}

public class BankDemo {

	public static void main(String[] args) 
	{
		Customer c1 = new Customer();
		c1.deposit(20000);
		c1.withdraw(30000);
	}

}