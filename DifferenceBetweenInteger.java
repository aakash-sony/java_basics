import java.util.Scanner;
public class DifferenceBetweenInteger
{
   public static void main(String args[])
   {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter first number: ");
	int num1 = sc.nextInt();

	System.out.print("Enter second number: ");
	int num2 = sc.nextInt();

	findingDifference(num1, num2);
	
   }
   
   static void findingDifference(int a, int b)
   {
	if(a > b)
        {
	   System.out.println("Difference is : "+(a - b));
	}
	else if(b > a)
	{
	   System.out.println("Difference is : "+(b - a));
	}
	else
	{
	   System.out.println("Both are same.");
	}
   }
}