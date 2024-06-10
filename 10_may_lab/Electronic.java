public class Electronic extends Market
{
	String warrantyPeriod;
	Customer cust;

	public Electronic(String warrantyPeriod, Customer cust) 
	{
		super();
		this.warrantyPeriod = warrantyPeriod;
		this.cust = cust;
	}
	
	void purchase(int qty)
	{
		System.out.println(cust.getName()+" purchases "+qty+" units of electronics with a warranty until "+warrantyPeriod);
	}
	
}
