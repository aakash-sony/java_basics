import java.util.Scanner;
class Pattern2
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
			for(int space = 0; space < n-i; space++)
			{
				System.out.print(" ");
			}
			for(int j = 0; j <= i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}