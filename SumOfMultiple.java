import java.util.Scanner;

public class SumOfMultiple
{
    static int num1, num2, num3, sum;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First number");
		num1 = sc.nextInt();
		
		System.out.println("Enter Second number");
		num2 = sc.nextInt();
		
		System.out.println("Enter Third number");
		num3 = sc.nextInt();
		
		if(num1 > 0 && num2 > 0 && num3 > 0)
		{
			num1 = ((num1 +9)/10) * 10;
			
			num2 = ((num2 +9)/10) * 10;
			
			num3 = ((num3 +9)/10) * 10;
			
			sum = num1 + num2 + num3;
			
		}
		else
		{
			System.out.println("You are entering the wrong value.");
			return;
		}
		
		
		System.out.println("Sum : "+sum);
		
	}

}
