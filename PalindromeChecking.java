import java.util.Scanner;
public class PalindromeChecking
{
    public static void main(String args[])
    {
	int rev = 0, temp;
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number = sc.nextInt();

	temp = number;
	while(number != 0)
	{
	   int r = number % 10;
	   rev = rev * 10 + r;
	   number = number / 10;
	}
	if(rev == temp)
	{
	   System.out.println("Number is Palindrome.");
	}
	else
	{
	  System.out.println("Number is not a Palindrome.");
	}

    }
}