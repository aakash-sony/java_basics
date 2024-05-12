import java.util.*;
public class FirstAndLastDigit
{
     public static void main(String args[])
     {
	int r1 = 0, r2 = 0;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = sc.nextInt();

	r1 = number % 10;
	number = number / 10;

	while(number != 0)
	{
	   r2 = number % 10;
	   number = number / 10;
	}

	System.out.println("First digit is : "+r2);
	System.out.println("Last digit is : "+r1);
	
     }
}