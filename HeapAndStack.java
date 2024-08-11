class Customer
{
	private String name;
	private int id;

	public Customer(String name , int id) //constructor
	{
		super();
		this.name=name;
		this.id=id;
	}

	public void setId(int id)  //setter  
	{
		this.id=id;
	}

	public int getId() //getter
	{
		return this.id;
	}
}

public class HeapAndStack
{
	public static void main(String[] args) 
	{
		int val = 100;

		Customer c = new Customer("Ravi",2);

        m1(c);   
		
		//GC [1 object, 3000x is eligible 4 GC]

		System.out.println(c.getId());
	}

	public static void m1(Customer cust) //cust = c
	{
		cust.setId(5);

	    cust = new Customer("Rahul",7);

		cust.setId(9);
		System.out.println(cust.getId());
	}
}  