public class Clothing extends Market
{
	String size;
	Customer c;

	public Clothing(String size, Customer c) {
		super();
		this.size = size;
		this.c = c;
	}
	void purchase(int qty)
	{
		System.out.println(c.getName()+" purchase "+qty+" units of clothing of size "+size);
	}
}
