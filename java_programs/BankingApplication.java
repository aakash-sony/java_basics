class Customer
{
	private double currentbalance = 20000;
	private double withdrawAmount;
	
	public Customer(double withdrawAmount) 
	{
		super();
		this.withdrawAmount = withdrawAmount;
	}

	public void withrawAmount()
	{
		String name = null;
		if(currentbalance >= withdrawAmount)
		{
			name = Thread.currentThread().getName();
			System.out.println(withdrawAmount+ " amount withdraw by "+name);
			this.currentbalance = this.currentbalance - withdrawAmount;
		}
		else
		{
			name = Thread.currentThread().getName();
			System.err.println("Sorry " +name+" U have insufficient bal");
		}
	}
	
	
	
	
}

public class BankingApplication 
{
	public static void main(String[] args) 
	{
		Customer c1 = new Customer(20000);
		
		Runnable r1 = ()-> c1.withrawAmount();
		
		Thread t1 = new Thread(r1,"Person1");
		Thread t2 = new Thread(r1,"Person2");
		
		t1.start(); t2.start();

	}

}