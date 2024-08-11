//Find Harshad Number

import java.util.Scanner;
class Harshad_number
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		int temp = num;
		int sum = 0;
		while(num != 0)
		{
			int r = num  % 10;
			sum = sum + r;
			num = num / 10;
		}
		if(temp % sum == 0)
		{
			System.out.println("Given number is a harshad number.");
		}
		else
		{
			System.out.println("Given number is not a harshad number.");
		}
	}
	
}