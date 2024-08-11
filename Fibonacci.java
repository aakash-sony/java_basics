import java.util.*;
public class Fibonacci
{
     public static void main(String args[])
     {
	int a = 0, b = 1, n, sum = 0;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	n = sc.nextInt();

	for(int i = 1; i <= n; i++)
	{
	   System.out.println(a);
	   sum = a + b;
	   a = b; 
	   b = sum;
	}
     }
}