import java.util.Scanner;
public class NaturalNumber
{
    public static void main(String args[])
   {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter starting number: ");
	int number1 = sc.nextInt();

	System.out.print("Enter ending number: ");
	int number2 = sc.nextInt();

	for(int i = number1; i<=number2; i++)
	{
	   System.out.println(i);
	}
   }
}