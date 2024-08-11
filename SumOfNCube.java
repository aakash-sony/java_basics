import java.util.Scanner;
public class SumOfNCube
{
    public static void main(String args[])
    {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = sc.nextInt();

	getSumOfCube(number);
    }

    static void getSumOfCube(int num)
     {
	int sum = 0;
	for(int i = 1; i <= num; i++)
	{
	    sum = sum + i * i * i;
	}
	System.out.println("Sum of Cube: "+sum);
     }
}