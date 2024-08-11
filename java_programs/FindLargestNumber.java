import java.util.Scanner;
class FindLargestNumber
{
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();
		
		System.out.print("Enter third number: ");
		int num3 = sc.nextInt();
		
		getLargestNumber(num1, num2, num3);	
		
	}
	
	static void getLargestNumber(int a, int b, int c)
	{
		if(a > b && a > c)
		{
			System.out.println("Largest number is : "+a);
		}
		else if (a > b && a == c)
		{
			System.out.println(a+" and "+c+" are equal.");
		}
		else if(a == b && a > c)
		{
			System.out.println(a+" and "+b+" are equal.");
		}
		else if(a == b && a == c)
		{
			System.out.println("All are Equal.");
		}
		else if(b > c)
		{
			System.out.println("Largest number is : "+b);
		}
		else if (b == c)
		{
			System.out.println(b+" and "+c+" are equal.");
		}
		else
		{
			System.out.println("Largest number is : "+c);
		}
	}
}