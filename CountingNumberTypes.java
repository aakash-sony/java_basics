import java.util.Scanner;
public class CountingNumberTypes
{
    public static void main(String args[])
    {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = sc.nextInt();

	int zeroCount = 0, evenCount = 0, oddCount = 0;

	while(number != 0)
	{
	   int r = number % 10;
	    if(r == 0)
	    {
		zeroCount++;
	    }
	   else if(r % 2 == 0)
	    {
		evenCount++;
	    }
	   else
	    {
	       oddCount++;
	    }
	   number = number / 10;
	}
	System.out.println("Total even numbers: "+evenCount);
	System.out.println("Total odd numbers: "+oddCount);
	System.out.println("Total zero numbers: "+zeroCount);
    }
}
