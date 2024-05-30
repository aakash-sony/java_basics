import java.util.Scanner;
class PowerCalulate
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the base number: ");
		int base = sc.nextInt();
		
		System.out.print("Enter the power number: ");
		int power = sc.nextInt();
		
		System.out.println("The Power Value is : "+getPowerValue(base, power));
		
	}	
	
	static int getPowerValue(int m, int n)
	{
		int power = 1;
		for(int i = 1; i <= n; i++)
		{
			power = power * m;
		}
		
		return power;
	}

}