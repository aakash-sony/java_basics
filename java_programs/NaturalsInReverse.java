import java.util.Scanner;
class NaturalsInReverse
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter last number: ");
		int num2 = sc.nextInt();
		
		getReverseNaturalNumber(num1, num2);
	
	}
	
	static void getReverseNaturalNumber(int n1, int n2)
	{
		for(int i = n2; i >= n1; i--)
		{
			System.out.println(i);
		}
	}
}