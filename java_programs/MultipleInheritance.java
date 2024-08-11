interface Alpha
{
	void m1();
}
interface Beta
{
	void m1();
}
class Implementer implements Alpha,Beta
{
	@Override
	public void m1() 
	{
		System.out.println("Multiple inheritance using interface");		
	}
}

public class MultipleInheritance {

	public static void main(String[] args) 
	{
	  new Implementer().m1();	
	}

}