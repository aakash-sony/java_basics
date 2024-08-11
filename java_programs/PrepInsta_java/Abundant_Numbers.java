//Abundant_Numbers

import java.util.Scanner;
class Abundant_Numbers
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		if(ifAbundant_Numbers(num))
		{
			System.out.println("Abundant_Numbers");
		}
		else
		{
			System.out.println("not an Abundant_Numbers");
		}
	}
	
	static boolean ifAbundant_Numbers(int n)
	{
	    int sum = 0;
		for(int i = 1; i < n; i++)
		{
			if(n % i == 0)
			{
				sum = sum + i;
			}
		}
		if(sum > n)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}