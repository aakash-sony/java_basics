import java.util.Scanner;
class SumOfDigits
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number for finding the sum of digits: ");
		int num = sc.nextInt();
		
		getSumOfDigits(num);
	
	}
	
	static void getSumOfDigits(int n)
	{
		int sum = 0;
		while(n != 0)
		{
			int r = n % 10;
			sum = sum + r;
			n = n / 10;
		}
		System.out.println("Sum of digits: "+sum);
	}
}