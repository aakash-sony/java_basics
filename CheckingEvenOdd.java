import java.util.Scanner;
class CheckingEvenOdd
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number for checking even or odd: ");
		int num = sc.nextInt();
		
		if(isEven(num))
		{
			System.out.println(num+" is a even number.");
		}
		else
		{
			System.out.println(num+" is a odd number.");
		}
		
	}
	
	static boolean isEven(int a)
	{
		if(a % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}