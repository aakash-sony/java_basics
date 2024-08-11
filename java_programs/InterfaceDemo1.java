interface Drawable
{
	void m1();
	
	default void m2()
	{
		m4();
		m5();		
	}
	
	static void m3()
	{
		m4();	
	}
	
	private static void m4()
	{
		System.out.println("Private Static method");
	}
	
	private  void m5()
	{
		System.out.println("Private Non Static method");
	}

}
class Implementer implements Drawable
{
	@Override
	public void m1() 
	{
		System.out.println("m1 method overridden");		
	}	
}

public class InterfaceDemo1
{
	public static void main(String[] args) 
	{
		Drawable d = new Implementer();
		d.m1();
		d.m2();
		
		
		Drawable.m3();

	}

}