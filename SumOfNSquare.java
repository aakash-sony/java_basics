import java.util.Scanner;
public class SumOfNSquare
{
    public static void main(String args[])
    {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = sc.nextInt();

	getSumOfSquare(number);
    }

    static void getSumOfSquare(int num)
     {
	int sum = 0;
	for(int i = 1; i <= num; i++)
	{
	    sum = sum + i * i;
	}
	System.out.println("Sum of Square: "+sum);
     }
}