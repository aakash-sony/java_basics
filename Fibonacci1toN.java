import java.util.*;
public class Fibonacci1toN
{
     public static void main(String args[])
     {
	int a = 0, b = 1, sum = 0;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = sc.nextInt();

	System.out.println("Fibonacci series are: ");
	for(int i = 1; i <= number; i++)
	{
	   System.out.println(a);
	   sum = a + b;
	   a = b;
	   b = sum;
	}
     }
}