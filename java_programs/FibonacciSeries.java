import java.util.Scanner;
class FibonacciSeries
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number for printing the Fibonacci Series: ");
		int num = sc.nextInt();
		
		getFibonacciSeries(num);
	}
	
	static void getFibonacciSeries(int n)
	{
		int a = 0, b = 1, sum;
		for(int i  = 0; i < n; i++)
		{
		  System.out.print(a+" ");
		  sum = a + b;
		  a = b;
		  b  = sum;
	    }
	}
}