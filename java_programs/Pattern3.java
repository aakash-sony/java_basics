import java.util.Scanner;
class Pattern3
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter row size: ");
		int row = sc.nextInt();
		
		patternPrinting(row);
		
	}
	static void patternPrinting(int n)
	{
		for(int i = 0; i <= n; i++)
		{
			for(int j = n; j >= i; j--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}
}