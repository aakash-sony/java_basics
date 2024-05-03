import java.util.*;
public class LabPalindromeTest
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.print("Enter three Digit number: ");
	     int number = sc.nextInt();
	     
	     if(number <= 0)
	     {
	         System.out.println("Return = -1");
	         System.out.println("The given number is zero or negative please provide positive number.");
	     }
	    else if(number <= 99)
	     {
	         System.out.println("Return = -1");
	         System.out.println("The given number is must be three digits only.");
	     }
	     else if (number > 99 && number <= 999)
	     {
	         int r1 = number/100;
	         int r2 = number%10;
	     
	         if(r1 == r2)
	        {
	          System.out.println("Return = 1");
	          System.out.println("The number is Palindrome.");
	        }
	        else {
	           System.out.println("Return = 0");
	           System.out.println("The number is not a Palindrome.");
	        }
	     }
	     else
	     {
	         System.out.println("Please enter three digits only.");
	     }

	}
}