//Strong_number

import java.util.Scanner;
class Strong_number
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		if(ifStrong_number(num))
		{
			System.out.println("Strong_number");
		}
		else
		{
			System.out.println("not an Strong_number");
		}
	}
	
	static boolean ifStrong_number(int n)
	{
		int sum = 0, fact = 1;
		int temp = n;
	   while(n != 0)
	   {
		  int r = n % 10;
		  while(r != 0)
		  {
			 fact = fact * r;
			 r--;
		  }
		  sum = sum + fact;
		  n = n / 10;
		  fact = 1;
	   }
		if(sum == temp)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}