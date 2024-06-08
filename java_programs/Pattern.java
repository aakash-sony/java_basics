import java.util.Scanner;
class Pattern
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row size: ");
		int row = sc.nextInt();
		
		printingPattern(row);
		
	}
	static void printingPattern(int n)
	{
		for(int i = 0; i <= n; i++)
		{
			for(int j = 0; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}