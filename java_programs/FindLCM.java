import java.util.Scanner;
class FindLCM
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("LCM of "+num1+" and "+num2+" is: "+getLCM(num1, num2));
	}
	
	static int getLCM(int a, int b)
	{
		int lcm = 1;
		for(int i = 1; i <= a && i <= b; i++)
		{
			if(a % i == 0 || b % i == 0)
			{
			   lcm = lcm * i;
			}
		}
		return lcm;
	}
	
}