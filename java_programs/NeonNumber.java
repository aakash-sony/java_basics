import java.util.Scanner;
class NeonNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		
		if(isNeon(n))
		{
			System.out.println("Given number is a neon number.");
		}
		else
		{
			System.out.println("Given number is not a neon number");
		}
	}
	
	static boolean isNeon(int n)
	{
		int square = n * n;
		int sum = 0;
		while(square != 0)
		{
			int r = square % 10;
			sum = sum + r;
			square = square / 10;
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