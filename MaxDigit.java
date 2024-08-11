import java.util.*;
public class MaxDigit
{
     public static void main(String args[])
     {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int number  = sc.nextInt();

	int r = number % 10;
	int max = r;
	number = number / 10;
	for(int i = 1; i <= number; i++)
	{
	   r = number % 10;
	   if(r > max)
           {
               max = r;
           } 
	   number = number / 10;	   
	}
	System.out.println("Max Digit is: "+max);
     }
	
}