import java.util.Scanner;
class PowerCalcualation
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the base number: ");
		int baseNum = sc.nextInt();
		
		System.out.print("Enter the power number: ");
		int powerNum = sc.nextInt();
		
		System.out.println("The power value: "+calculatePower(baseNum, powerNum));
	}
	
	static int calculatePower(int n, int m)
	{
		int powerValue = 1;
		while(m != 0)
		{
			powerValue = powerValue * n;
			m--;
		}
		return powerValue;
	}
}