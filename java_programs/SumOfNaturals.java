import java.util.Scanner;
class SumOfNaturals
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();
		
		getSumOfNaturalNumber(num1, num2);
	
	}
	
	static void getSumOfNaturalNumber(int a, int z)
	{
		int sum = 0;
		for(int i = a; i <= z; i++)
		{
			sum = sum + i;	
		}
		System.out.println("Sum of natural numbers: "+sum);
	}
}