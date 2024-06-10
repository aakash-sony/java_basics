public class Grocery extends Market
{
	String expirationDate;
	Customer c;

	public Grocery(String expirationDate, Customer c) {
		super();
		this.expirationDate = expirationDate;
		this.c = c;
	}
    void purchase(int qty)
    {
    	System.out.println(c.getName()+" purchases "+qty+" units of groceries expiring on "+expirationDate);
    }
}
