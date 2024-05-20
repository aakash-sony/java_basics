import java.util.Scanner;
public class SumOfReverseNaturalNum
{
    public static void main(String args[])
    {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = sc.nextInt();

	sumOfReverseNaturalNum(number);
    }

    static void sumOfReverseNaturalNum(int n)
     {
	int sum = 0;
	for(int i = n; i >= 1; i--)
	{
	    sum = sum + i;
	}
	System.out.println("Sum of Reverse Natural Number: "+sum);
     }
}