import java.util.Scanner;
class MultiplicationTable
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number for Table Printing: ");
		int num = sc.nextInt();
		
		tablePrinting(num);
	
	}
	
	static void tablePrinting(int n)
	{
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(n+" X "+i+" = "+n*i);
		}
	}
}