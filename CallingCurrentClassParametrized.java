class Base
{
	public Base()
	{
		this(9);
		System.out.println("No Args of Base class");
	}
	
	public Base(int x)
	{	        
		System.out.println("Parameterized of Base class :"+x);
	}
	
}
class Derived extends Base
{
	public Derived()
	{
		System.out.println("No args of Derived class");
	}
}


public class CallingCurrentClassParametrized {

	public static void main(String[] args) 
	{
		new Derived();

	}

}