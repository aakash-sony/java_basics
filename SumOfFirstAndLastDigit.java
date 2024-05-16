import java.util.*;
public class SumOfFirstAndLastDigit
{
	 static int sum = 0;
	 static int r1, r2;
     public static void main(String args[])
     {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num = sc.nextInt();

	sumOfFirstAndLastDigit(num);
     }
      static void sumOfFirstAndLastDigit(int number)
      {
	 r1 = number % 10;
	 number = number / 10;
	
	 while(number != 0)
	 {
	    r2 = number % 10;
	    number = number / 10; 
	 }
        sum = r1 + r2;
	System.out.println("Sum of first and last digit : "+sum);
      }
}