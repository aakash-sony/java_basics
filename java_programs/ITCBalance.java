
class Customer
{
	private double balance = 10000;
	
	public synchronized void withdraw(double amount) 
	{
		System.out.println("Going To Withdraw!!");
		if(amount > balance)
		{
			System.out.println("Less Amount, Waiting 4 deposit");
			try
			{
				wait();
			}
			catch(InterruptedException e)
			{
				
			}
		}		
		
		this.balance = this.balance - amount;
		System.out.println("Amount after Withdraw is :"+this.balance);
		
		
	}
	
	public synchronized void deposit(double amount)
	{
		System.out.println("Going to deposit!!");
		this.balance = this.balance + amount;
		System.out.println("Balance After deposit :"+this.balance);
		notify();
	}
}


public class ITCBalance 
{
	public static void main(String[] args) throws InterruptedException  
	{
		Customer c1 = new Customer();
		
		Thread son = new Thread()
		{
			@Override
			public void run()
			{
				c1.withdraw(15000);
			}
		};
		son.start();
		
		Thread.sleep(1000);
		
		
		Thread father = new Thread()
		{
			@Override
			public void run()
			{
				c1.deposit(10000);
			}
		};
        father.start();
	}

}