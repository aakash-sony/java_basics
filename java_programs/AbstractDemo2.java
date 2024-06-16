
abstract class Alpha
{
	public abstract void show();
	public abstract void demo();
}

abstract class Beta extends Alpha
{
	@Override
	public void show()
	{
		System.out.println("Show method overridden in Beta class");
	}
}
class Gamma extends Beta
{
	@Override
	public void demo() 
	{
		System.out.println("Demo method implemented in Gamma class");		
	}	
}

public class AbstractDemo2 
{
	public static void main(String[] args) 
	{
		Gamma g = new Gamma();
		g.show();  g.demo();

	}

}