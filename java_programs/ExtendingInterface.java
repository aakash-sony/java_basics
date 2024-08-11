interface I
{
	void m1();
}
interface J extends I
{
	void m2();
}

class C implements I,J
{

	@Override
	public void m2() 
	{
		System.out.println("m2 method implemented!!!");		
	}

	@Override
	public void m1()
	{
		System.out.println("m1 method implemented!!!");				
	}	
}

public class ExtendingInterface {

	public static void main(String[] args) 
	{
		C c1 = new C(); c1.m1();  c1.m2();

	}

}