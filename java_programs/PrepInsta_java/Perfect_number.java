//Perfect_number

import java.util.Scanner;
class Perfect_number
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		if(ifPerfect_number(num))
		{
			System.out.println("Perfect_number");
		}
		else
		{
			System.out.println("not an Perfect_number");
		}
	}
	
	static boolean ifPerfect_number(int n)
	{
		int sum = 0;
	    for(int i = 1; i < n; i++)
		{
			if(n % i == 0)
			{
				sum = sum + i;
			}
		}
		if(sum == n)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}