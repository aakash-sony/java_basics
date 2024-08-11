import java.util.*;
public class NaturalSumAvg
{
    public static void main(String args[])
    {
	int sum = 0;
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = sc.nextInt();

	for(int i = 1; i <= number; i++)
	{
	   sum = sum + i; 
	}
	float average = (float)sum / number;
	System.out.println("Sum of numbers: "+sum);
	System.out.println("Average of numbers: "+average);
    }
}