public class ExceptionPropagation 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started!!");
		try
		{
			m1();
		}
		catch(ArithmeticException e)
		{
			System.err.println("Handled in Main method");
		}
		System.out.println("Main method ended!!");
	}
	
	public static void m1() 
	{
		System.out.println("M1 method started!!");
		m2();
		System.out.println("M1 method ended!!"); //This line not executed
	}
	
	public static void m2() 
	{
		System.out.println(10/0);
	}
}