import java.util.Scanner;
class ExceptionHandling1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int n1 = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int n2 = sc.nextInt();
		
		try
		{
			int z = n1 / n2;
			System.out.println("Result: "+z);
		}
		catch(Exception e)
		{
			System.out.println("Can't divide by zero");
		}
		System.out.println("Main ended");
	}
}