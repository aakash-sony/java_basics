import java.util.*;
public class SumOfEvenOdd
{
      public static void main(String args[])
      {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int num = sc.nextInt();

	evenOddSum(num);
      }
      
      static void evenOddSum(int number)
      {
	 int eSum = 0, oSum = 0; 
	while(number != 0)
	{
           int r = number % 10;
	   if(r % 2 == 0)
	   {
	     eSum = eSum + r;
	   }
	   else
	   {
	     oSum = oSum + r;
	   }
	  number = number / 10;
	}
	 System.out.println("Even number sum: "+eSum);
	 System.out.println("Odd number sum: "+oSum);
	 
      }

}