import java.util.Scanner;
class ExceptionHandling3
{
	public static void main(String args[])
	{
		try
		{
			String str = null;
			System.out.println(str.toUpperCase());
		}
		catch(Exception e)
		{
			System.out.println("Null can't be casted.");
		}
		System.out.println("Main ended");
	}
}