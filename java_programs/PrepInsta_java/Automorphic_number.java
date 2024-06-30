//Checking Automorphic_number
import java.util.Scanner;
class Automorphic_number
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		if(ifCheckingAutomorphic_number(num))
		{
			System.out.println("Automorphic_number");
		}
		else
		{
			System.out.println("not an Automorphic_number");
		}
	}
	
	static boolean ifCheckingAutomorphic_number(int n)
	{
		int sq = n * n;
		while(n != 0)
		{
			if(n % 10 != sq  % 10)
			{
				return false;
			}
			n = n / 10;
			sq = sq / 10;
		}
		return true;
	}
}