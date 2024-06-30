//Friendly_Pair

import java.util.Scanner;
class Friendly_Pair
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();
		
		if(ifFriendly_Pair(num1, num2))
		{
			System.out.println("Friendly_Pair");
		}
		else
		{
			System.out.println("not a Friendly_Pair");
		}
	}
	
	static boolean ifFriendly_Pair(int n1, int n2)
	{
	    int sum1 = 0, sum2 = 0;
		
		for(int i = 1; i < n1; i++)
		{
			if(n1 % i == 0)
			{
				sum1 = sum1 + i;
			}
		}
		
		for(int i = 1; i < n2; i++)
		{
			if(n2 % i == 0)
			{
				sum2 = sum2 + i;
			}
		}
		
		if(n1 % sum1 == n2 % sum2)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}