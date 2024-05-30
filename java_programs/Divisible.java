import java.util.Scanner;
class Divisible
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		if(isDivisible(num))
		{
			System.out.println(num+" is divisible by 5 and 11.");
		}
		else
		{
			System.out.println(num+" is not divisible by 5 and 11.");
		}
		
	}
	static boolean isDivisible(int n)
	{
		if(n % 5 == 0 && n % 11 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}