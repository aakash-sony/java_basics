import java.util.Scanner;
class CheckingPrimeNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number for checking Prime or not: ");
		int num = sc.nextInt();
		
		if(isPrime(num))
		{
			System.out.println(num+" is a Prime number.");
		}
		else
		{
			System.out.println(num+" is not a Prime number.");
		}
	}
	
	static boolean isPrime(int n)
	{
		int i;
		for(i = 2; i <= n; i++)
		{
			if(n % i == 0)
			{
				break;
			}
		}
		if(n == i)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}