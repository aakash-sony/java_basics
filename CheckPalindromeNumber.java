import java.util.*;
public class CheckPalindromeNumber
{
    public static void main(String args[])
    {
	int remainder, temp, reverse = 0;
       Scanner sc = new Scanner(System.in);

	System.out.print("Please Enter a number: ");
	int number = sc.nextInt();
	
	 temp = number;
	while(number!=0)
        {
	  remainder = number % 10;
	  reverse = reverse * 10 + remainder;
	  number = number / 10;
	}
       if(temp == reverse)
       {
	  System.out.println("The given number is Palindrome.");
       }
       else
       {
	  System.out.println("The given number is not a Palindrome.");	
       }
	
    }
}