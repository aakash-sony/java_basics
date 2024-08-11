import java.util.Scanner;
import java.lang.*;
class Armstrong
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		if(isArmstrong(num))
		{
			System.out.println(num+" is a Armstrong number.");
		}
		else
		{
			System.out.println(num+" is not a Armstrong number.");
		}
		
	}
	
	static boolean isArmstrong(int n)
	{
		int temp, count = 0;
		double sum = 0;
			temp = n;
		while(temp != 0)
		{
			count++;
			temp = temp / 10;
		}
		temp = n;
		while(temp != 0)
		{
			int r = temp % 10;
			sum = sum + Math.pow(r, count);
			temp = temp / 10;
		}
		if(sum == n)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}