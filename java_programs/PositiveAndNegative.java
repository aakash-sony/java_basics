import java.util.Scanner;
class PositiveAndNegative
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		isPositive(num);
		
	}
	
	static void isPositive(int n)
	{
		if(n > 0)
		{
			System.out.println("Given Number is positive.");
		}
		else if(n < 0)
		{
			System.out.println("Given Number is negative.");
		}
		else
		{
			System.out.println("Given Number is niether positive nor negative. Number is zero.");
		}
	}
}