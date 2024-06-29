public class MethodCalling {

	public static void main(String[] args)
	{
		try
		{
			m1();
		}
		catch(InterruptedException e)
		{
			
		}
	}
	
	public static void m1() throws InterruptedException
	{
		System.out.println("m1 method");
	}

}