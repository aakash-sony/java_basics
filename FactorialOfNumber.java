import java.util.Scanner;
class FactorialOfNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number for finding factorial: ");
		int num = sc.nextInt();
		
		System.out.println("Factorial of "+num+" is: "+getFactorial(num));
		
	}
	
    public static int getFactorial(int num)
	{
		int fact = 1;
		for(int i = 1; i <= num; i++)
		{
			fact = fact * i;
		}
		return fact;
	}
}