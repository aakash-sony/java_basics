//Perfect_Square

import java.util.Scanner;
class Perfect_Square
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		if(ifPerfect_Square(num))
		{
			System.out.println("Perfect_Square");
		}
		else
		{
			System.out.println("not an Perfect_Square");
		}
	}
	
	static boolean ifPerfect_Square(int n)
	{
	    int sqrt = (int)Math.sqrt(n);
		if(sqrt * sqrt == n)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}