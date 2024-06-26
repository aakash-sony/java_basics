import java.util.Scanner;
class ExceptionHandling2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.nextLine();
		try
		{
			int a = Integer.parseInt(str);
			System.out.println("Result: "+a);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Main ended");
	}
}