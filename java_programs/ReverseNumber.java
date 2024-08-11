import java.util.Scanner;
class ReverseNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number for printing in reverse order: ");
		int num = sc.nextInt();
		
		getReverse(num);
	
	}
	
	static void getReverse(int n)
	{
		int reverse = 0;
		while(n != 0)
		{
			int r = n % 10;
			reverse = reverse * 10 + r;
			n = n / 10;
		}
		System.out.println("Number in reverse order: "+reverse);
	}
}