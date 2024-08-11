import java.util.Scanner;
class NaturalNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int n1 = sc.nextInt();
		
		System.out.print("Enter last number: ");
		int n2  = sc.nextInt();
		
		printingNaturalNumber(n1, n2);
	}
	
	static void printingNaturalNumber(int n1, int n2)
	{
		for(int i = n1; i <= n2; i++)
		{
			System.out.print(i+" ");
		}
	}
}